package ismaxvai.rpg;

public class CreatePlayer {
	private String name;
	private String race;
	private int age;
	private String description;
	private String story;
	private int hp;
	private CharacterCreationForm form;
	
	public CharacterCreationForm getForm() {
		return form;
	}
	public void setForm(CharacterCreationForm form) {
		this.form = form;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	CreatePlayer(String n, String r, int a, String desc, String stry, int h, CharacterCreationForm f){
		name = n;
		race = r;
		age = a;
		description = desc;
		story = stry;
		hp = h;
		form = f;
	}
	
	
}
