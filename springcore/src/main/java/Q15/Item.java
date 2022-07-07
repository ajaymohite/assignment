package Q15;

public class Item {
	
	int itemId;
	String itemName;
	int price;
	Category cat;
	
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
	public void showItem()
	{
		System.out.println("Item Id : "+itemId);
		System.out.println("Item Name : "+itemName);
		cat.showCategory();
	}

}
