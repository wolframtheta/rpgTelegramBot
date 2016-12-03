package ismaxvai.rpg;

public class Skill {
	private String skillName;
	private int min;
	private int max;
	
	Skill(String skill,int mn, int mx){
		skillName = skill;
		mn = min;
		mx = max;
	}
	
	public String getSkilName() {
		return skillName;
	}
	public void setSkill(String skillName) {
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
}
