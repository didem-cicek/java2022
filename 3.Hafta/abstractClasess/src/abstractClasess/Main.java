package abstractClasess;

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.gameOver();
		womanGameCalculator.hesapla();
		
		//abstract sınıflar newlenemez.
		//normal sınıftan farklı yoktur.
		
		GameCalculator gameCalculator = new WomanGameCalculator();
		
		

	}

}
