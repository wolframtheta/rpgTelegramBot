package ismaxvai.rpg;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;
import org.telegram.telegrambots.generics.UpdatesHandler;

public class Rpgbot {
	static String USERNAME = "xvaibot";
	static String TOKEN = "253251073:AAFT1DnXYpVdzfNS97waRT-Jr4VFWuwSxFw";
	public static final String url = "jdbc:mariadb://hrr5mwqn9zs54rg4.chr7pe7iynqr.eu-west-1.rds.amazonaws.com/vsvpm40pyrm7dvnc";
    public static final String controllerDB = "com.mysql.jdbc.Driver";
    public static final String username = "ut88tvlfk6byjr9u";
    public static final String password = "r4tfq8212p9uptej";
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
