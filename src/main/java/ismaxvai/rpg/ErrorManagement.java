package ismaxvai.rpg;

public class ErrorManagement {
	public String errorCode(int errorCode){
		switch(errorCode){
			case -1: return "too many dices in a roll";
			case -2: return "illegal dice type, it only can be used dices of 4, 6, 8, 10, 12 and 20 faces";
			case -3: return "incorrect dice format";
			case -4: return "there's something already equiped";
			case -5: return "the player hasn't got the object";
			case -6: return "the maximum value of this skill has been exceeded";
		}
		return "invalid error code";
	}
}
