package ismaxvai.rpg;

public class ErrorManagement {
	public String errorCode(int errorCode){
		switch(errorCode){
			case -1: return "too many dices in a roll";
			case -2: return "illegal dice type, it only can be used dices of 4, 6, 8, 10, 12 and 20 faces";
		}
		return "invalid error code";
	}
}
