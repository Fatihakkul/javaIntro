package oopintro;

public class Product {
	
	// constructor tanýmlamasý
	public Product() {
		System.out.println("Classdan merhaba");
	}
	
	public Product(int id , String name , double unitPrice , String detail) {
		this();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.unitPrice = unitPrice;
	}
	
	int id;
	String name;
	double unitPrice;	
	String detail;
	
}
