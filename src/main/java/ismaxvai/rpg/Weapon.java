package ismaxvai.rpg;

public class Weapon extends Item{
	private int attack;
	
	
	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	Weapon(String n, int qtty, String desc, int atck) {
		super(n, qtty, desc);
		attack = atck;
	}
	
}
