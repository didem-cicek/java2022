package abstractClasess;

public abstract class GameCalculator {
	//Hesapla metodunun doldurulmasÄ± zorunludur.
	
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Oyun bitti");
	}

}
