package constructors;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(10000);
		product.setRenk("Siyah");
		product.setStockAmount(3);
		System.out.println(product.getKod());
		
		Product product2 = new Product(1, "Laptop", "Del Laptop", 20000, 4, "Beyaz");
		System.out.println(product2.getKod());

	}

}
