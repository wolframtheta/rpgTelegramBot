package ismaxvai.rpg;

public class Equipment extends Item {
	private int defence;
	
	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}

	Equipment(String n, int qtty, String desc,int def, int id) {
		super(n, qtty, desc, id);
		defence = def;
	}

	
}
