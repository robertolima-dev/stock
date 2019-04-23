package entities;

public class Product {

	// Attribute
	private String name;
	private double price;
	private int quantity;

	// Constructor
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Constructor - overload default
	public Product() {
	}

	// Constructor - overload
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Getter
	public String getName() {
		return name;
	}

	// Setter
	public void setName(String name) {
		this.name = name;
	}

	// Getter
	public double getPrice() {
		return price;
	}

	// Setter
	public void setPrice(double price) {
		this.price = price;
	}

	// Getter
	public int getQuantity() {
		return quantity;
	}

	// Method
	public double totalValueInStock() {
		return price * quantity;
	}

	// Method
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	// Method
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	// Method
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ : "
				+ String.format("%.2f", totalValueInStock());
	}
}