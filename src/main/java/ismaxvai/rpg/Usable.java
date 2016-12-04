package ismaxvai.rpg;

public class Usable extends Item{
	private  int uses;
	
	public int getUses() {
		return uses;
	}
	public void setUses(int uses) {
		this.uses = uses;
	}
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
