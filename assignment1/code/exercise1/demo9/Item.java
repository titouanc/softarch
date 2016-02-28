
package exercise1.demo9;

public class Item {

	private String name;
	private ItemType type;

	public Item(String name, ItemType type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return name;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}
}
