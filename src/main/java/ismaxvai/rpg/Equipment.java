package ismaxvai.rpg;

public class Equipment extends Item {
	private int defence;
	
	Equipment(String n, int qtty, String desc,int def) {
		super(n, qtty, desc);
		defence = def;
	}

	
}
