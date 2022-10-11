package abstractClasess;

public abstract class GameCalculator {
	//Hesapla metodunun doldurulması zorunludur.
	
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Oyun bitti");
	}

}
