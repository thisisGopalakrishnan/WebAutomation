package opps_concept;

abstract class poly_abstraction {//class level abstract
//encapsulation of the variable we can only access the variable through creating the methods
	protected int price;
	protected String product_name;
	protected int amount;
	protected String website;

	public poly_abstraction(int price, int amount, String product_name, String website) {
		this.amount = amount;
		this.price = price;
		this.product_name = product_name;
		this.website = website;

	}

	public abstract void gender();// method level abstract

	public void abstractcalsstesting() {
		System.out.println("I CAN ABLE TO PRINT");
	}

}
