package ismaxvai.rpg;

public class Item {
	private String name;
	private int quantity;
	private String description;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	Item(String n, int qtty, String desc){
		name = n;
		quantity = qtty;
		description = desc;
	}
	
}
