package Q15;

public class Customer {
	
	int custId;
	String custName;
	
	Item item;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	
	
	public  void showCustomer()
	{
		System.out.println("Customer Id : "+custId);
		System.out.println("Custoer Name : "+custName);
		item.showItem();
	}

}
