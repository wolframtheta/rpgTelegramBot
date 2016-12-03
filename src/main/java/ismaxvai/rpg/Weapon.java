package ismaxvai.rpg;

public class Weapon extends Item{
	private int attack;
	
	
	Weapon(String n, int qtty, String desc, int atck) {
		super(n, qtty, desc);
		attack = atck;
	}
	
}
