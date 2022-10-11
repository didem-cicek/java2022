package getterSetter;

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

	}

}
