package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static yapıcı blok çalıştı");
	}
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı.");
	}
	//nesnenin örneğini oluşturur. 1 kere oluşur. Bellekten atılmaz.
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	//ProductValidator newlenirse gelir. Static olmadığı için
	public void bisey() {
		
	}
	
	//inner class
	public static class baskaBirClass{
		public static void sil() {
			
		}
	}

}
