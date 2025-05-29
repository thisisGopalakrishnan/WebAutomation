package opps_concept;

class roadster extends poly_abstraction {

	public roadster(int price, int amount, String product_name, String website) {
		super(price, amount, product_name, website);
	}

	@Override
	public void gender() {
		System.out.println(price + "   " + amount + "  " + product_name + "   " + website);
	}
}

public class Main {
	public static void main(String[] args) {
		poly_abstraction product = new roadster(2000, 1000, "jean", "myntra");
		product.gender();
		product.abstractcalsstesting();
	}
}