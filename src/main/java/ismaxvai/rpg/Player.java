package ismaxvai.rpg;

import java.util.HashMap;

public class Player {
	private String name;
	private String race;
	private int age;
	private String description;
	private String story;
	private int hp;
	private CharacterCreationForm form;
	private int id;
	private HashMap<Integer, Item> inventory;
	private int head;
	private int feet;
	private int arms;
	private int chest;
	private int defence;
	private int attack;
	private int right;
	private int left;
	
	public int getHead() {
		return head;
	}
	public void setHead(int head) {
		this.head = head;
	}
	public int getFeet() {
		return feet;
	}
	public void setFeet(int feet) {
		this.feet = feet;
	}
	public int getArms() {
		return arms;
	}
	public void setArms(int arms) {
		this.arms = arms;
	}
	public int getChest() {
		return chest;
	}
	public void setChest(int chest) {
		this.chest = chest;
	}
	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	
	public HashMap<Integer, Item> getInventory() {
		return inventory;
	}
	public void setInventory(HashMap<Integer, Item> inventory) {
		this.inventory = inventory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	
	Player(String n, String r, int a, String desc, String stry, int h, CharacterCreationForm f, int i){
		name = n;
		race = r;
		age = a;
		description = desc;
		story = stry;
		hp = h;
		form = f;
		id = i;
		head = arms = feet = chest = defence = attack = right = left = 0;
		inventory = new HashMap<Integer, Item>();
	}
	
	private boolean property(Item it){
		return inventory.containsKey(it.getId());
	}
	
	public int addItem(Item it){
		if (property(it)) return -5;
		inventory.put(it.getId(), it);
		return 0;
	}
	
	public int quitItem(Item it){
		if (property(it)) return -5;
		inventory.remove(it.getId());
		return 0;
	}
	
	public int consumeUsable(Usable it){
		if (property(it)) return -5;
		int uses = it.getQuantity() - 1;
		it.setUses(0);
		if (uses == 0) quitItem(it);
		else it.setUses(uses);
		return 0;
	}
	
	public int equipCasc(Equipment it){
		if (property(it)) return -5;
		if(head == 0) head = it.getId();
		else return -4;
		defence += it.getDefence();
		return 0;
	}
	
	public int equipArmor(Equipment it){
		if (property(it)) return -5;
		if(chest == 0) chest = it.getId();
		else return -4;
		defence += it.getDefence();
		return 0;
	}
	
	public int equipBoots(Equipment it){
		if (property(it)) return -5;
		if(feet == 0) feet = it.getId();
		else return -4;
		defence += it.getDefence();
		return 0;
	}
	
	public int equipArmbands(Equipment it){
		if (property(it)) return -5;
		if(arms == 0) arms = it.getId();
		else return -4;
		defence += it.getDefence();
		return 0;
	}

	public int equipRight(Weapon we){
		if (property(we)) return -5;
		if(right == 0) right = we.getId();
		else return -4;
		attack += we.getAttack();
		return 0;
	}
	
	public int equipLeft(Weapon we){
		if (property(we)) return -5;
		if(left == 0)left = we.getId();
		else return -4;
		attack += we.getAttack();
		return 0;
	}
	
	public void unequipCasc(){
		head = 0;
	}
	
	public void unequipArmor(){
		chest = 0;
	}
	
	public void unequipBoots(){
		feet = 0;
	}
	
	public void unequipArmbands(){
		arms = 0;
	}

	public void unequipLeft(){
		left = 0;
	}
	
	public void unequipRight(){
		right = 0;
	}
	
	public void unequipHands(){
		right = left = 0;
	}
	
	public void unequipEverything(){
		head = chest = feet= arms = 0;
	}
	public int setSkill(String name, int value){
		 return form.setSkill(name, value);
	}
}
