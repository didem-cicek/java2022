package overriding;

public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	//final - override metot olur.
	public final double hesapla1(double tutar) {
		return tutar * 1.18;
	}
}
