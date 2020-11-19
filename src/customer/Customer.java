package customer;

public class Customer {
	protected int customerID;
	protected static String customerName;
	protected String customerGrade;
	static int bonusPoint;
	static double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	private void initCustomer() {
		customerGrade ="SIVER";
		bonusRatio =0.01;
	}
	
	public static int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	public String showCustomerInfo() {
		return customerName +"님의 등급은"
	+ customerGrade+"이며, 보너스포인트는"+bonusPoint+"입니다";
	}
	public void setCustomerID(int CustomerID) {
	     this.customerID=customerID;
	}
	public void setCustomerName(String CustomerName) {
		this.customerName = customerName;
		
	}
	public static String getCustomerName() {
		return customerName;
	}

}
