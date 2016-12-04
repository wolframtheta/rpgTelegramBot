package ismaxvai.rpg;

import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;


public class App
{
    public static void main( String[] args )
    {
    	String tirada = "1d20";
    	Dice dau = new Dice();
        System.out.println( dau.fullRolling(tirada) );
    }

}
