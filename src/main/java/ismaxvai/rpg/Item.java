package ismaxvai.rpg;

public class Item {
	private String name;
	private int quantity;
	private String description;
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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
	
	Item(String name, int quantity, String description, int id){
		this.name = name;
		this.quantity = quantity;
		this.description = description;
		this.id = id;
	}
	
}
