package ismaxvai.rpg;

public class Skill {
	private String skillName;
	private int min;
	private int max;
	private int actual;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getActual() {
		return actual;
	}
	public int setActual(int actual) {
		if(actual > min) return -6;
		this.actual = actual;
		return 0;
	}
	public String getSkilName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	
	Skill(String skillName,int min, int max, int id){
		this.skillName = skillName;
		this.min = this.actual = min;
		this.max = max;
		this.id = id;
	}
	
	public void increaseSkill(){ //MIRAR QUE ACTUAL NO SIGUI IGUAL O MAJOR QUE MAX
		++actual;
	}
}
