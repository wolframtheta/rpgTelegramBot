package ismaxvai.rpg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.glassfish.jersey.message.internal.Utils;
import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class HandlerRpg extends TelegramLongPollingBot {
	static String USERNAME = "xvaibot";
	static String TOKEN = "253251073:AAFT1DnXYpVdzfNS97waRT-Jr4VFWuwSxFw";
	private Connection connection;
	HandlerRpg(Connection connection)  {
		this.connection = connection;
	}
	public void onUpdateReceived(Update update) {
		String message = "";
		if (update.hasMessage()) message = update.getMessage().getText();
		
			if (update.getMessage().getText().contains("/roll")) {
				
				Dice dice = new Dice();
				String commandValue = getValue(message);
				System.out.println(commandValue);
				List<Integer> result = dice.fullRolling(commandValue);
				
				SendMessage res = new SendMessage().setChatId(update.getMessage().getChatId()).setText(result.toString());
				
				try {
					sendMessage(res);
				} catch (TelegramApiException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (update.getMessage().getText().contains("/addPlayer")) {
				try {
					Statement st = connection.createStatement();
					st.execute("INSERT INTO player VALUES ('" + update.getMessage().getFrom().getId() + "', '1')");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				SendMessage res = new SendMessage().setChatId(update.getMessage().getChatId()).setText("Added player");
				
				try {
					sendMessage(res);
				} catch (TelegramApiException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
//		if (update.hasMessage() && update.getMessage().hasText()) {
//	        SendMessage message = new SendMessage() // Create a SendMessage object with mandatory fields
//	                .setChatId(update.getMessage().getChatId())
//	                .setText(update.getMessage().getText());
//	        try {
//	            sendMessage(message); // Call method to send the message
//	        } catch (TelegramApiException e) {
//	            e.printStackTrace();
//	        }
//	    }
		
	}

	private String getValue(String message) {
		int i = 0;
		while (message.charAt(i) != ' ') ++i;
		return message.substring(i+1);
		
	}

	public String getBotUsername() {
		// TODO Auto-generated method stub
		return USERNAME;
	}

	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return TOKEN;
	}

}
