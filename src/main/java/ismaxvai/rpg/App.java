package ismaxvai.rpg;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;


public class App extends TelegramLongPollingBot
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public String getBotUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	public void onUpdateReceived(Update arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getBotToken() {
		// TODO Auto-generated method stub
		return null;
	}
}
