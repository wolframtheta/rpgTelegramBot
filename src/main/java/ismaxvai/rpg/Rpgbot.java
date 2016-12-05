package ismaxvai.rpg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.UpdatesHandler;

import io.fouad.jtb.core.builders.ApiBuilder;
import io.fouad.jtb.core.builders.KeyboardButtonBuilder;

public class Rpgbot {
	static String USERNAME = "xvaibot";
	static String TOKEN = "253251073:AAFT1DnXYpVdzfNS97waRT-Jr4VFWuwSxFw";
	public static final String url = "jdbc:mariadb://localhost/rpg";
    public static final String controllerDB = "com.mysql.jdbc.Driver";
    public static final String username = "root";
    public static final String password = "root";
	public static void main( String[] args ) throws SQLException {

		Connection connection = DriverManager.getConnection(url, username, password);
				ApiContextInitializer.init();

		        TelegramBotsApi botsApi = new TelegramBotsApi();

		        try {
		            botsApi.registerBot(new HandlerRpg(connection));
		        } catch (TelegramApiException e) {
		            e.printStackTrace();
		        }
    }
	
	
}
