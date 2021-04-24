package oopintro;

public class Main {

	public static void main(String[] args) {
		
		ProductManager productManager = new ProductManager();
		Product productOne = new Product(2,"lenovo" , 15000,"sdfsdf"); 
		//instance oluþturma , referans oluþturma
		productManager.addToCart(productOne.id);
	
		Product[] products = {productOne};
		
		for (Product product : products) {
			System.out.println(product.name);

		}
		//ctrl-space açýlýr pencere örnek sys yazdýktan sonra
	}

}
