package ismaxvai.rpg;

public class Usable extends Item{
	private  int uses;
	
	Usable(String n, int qtty, String desc, int us) {
		super(n, qtty, desc);
		uses = us;
	}
	//--------------------------------------------------
	public int use(){
		if(this.uses == 0) return -1;
		--uses;
		return 1;
		
	}
	//--------------------------------------------------
}
