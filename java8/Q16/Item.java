package Q16;

import java.time.LocalDate;

public class Item {
	
	//String itemName;
	//double price;
	//LocalDate dom;
	//LocalDate doe;
	//String categoryName;
	
	
	int itemId;
	String itemName;
	String categoryName;
	double price ;
	String dateOfManufacturing;
	String dateOfExpiring;
	
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
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDateOfMmanufacturing() {
		return dateOfManufacturing;
	}
	public void setDateOfMmanufacturing(String dateOfMmanufacturing) {
		this.dateOfManufacturing = dateOfMmanufacturing;
	}
	public String getDateOfExpiring() {
		return dateOfExpiring;
	}
	public void setDateOfExpiring(String dateOfExpiring) {
		this.dateOfExpiring = dateOfExpiring;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", categoryName="
				+ categoryName + ", price=" + price + ", dateOfMmanufacturing=" + dateOfManufacturing
				+ ", dateOfExpiring=" + dateOfExpiring + "]";
	}
	public Item(int itemId, String itemName, String categoryName, double price,
			String dateOfMmanufacturing, String dateOfExpiring) {
		super();
	
		this.itemId = itemId;
		this.itemName = itemName;
		this.categoryName = categoryName;
		this.price = price;
		this.dateOfManufacturing = dateOfMmanufacturing;
		this.dateOfExpiring = dateOfExpiring;
	}
	
	
	
	

}
