package ismaxvai.rpg;

public class Weapon extends Item{
	private int attack;
	private boolean oneHand;
	
	
	public boolean isOneHand() {
		return oneHand;
	}


	public void setOneHand(boolean oneHand) {
		this.oneHand = oneHand;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	Weapon(String n, int qtty, String desc, int atck, int id, boolean oneHand) {
		super(n, qtty, desc, id);
		this.attack = attack;
		this.oneHand = oneHand;
	}
	
}
