package classesWithAttritubes;

public class Main {

	public static void main(String[] args) {
		
		Product product2 = new Product(2, "Laptop", "Del Laptop", 6000, 5, "Siyah");
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		System.out.println(product.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
	}

}
