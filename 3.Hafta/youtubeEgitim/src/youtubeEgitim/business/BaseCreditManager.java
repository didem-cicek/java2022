package youtubeEgitim.business;

public abstract class BaseCreditManager implements ICreditManager{
	public abstract void Calcute();
	
	public void Save() {
		System.out.println("Kaydedildi.");
	}
}
