package methods;

public class Main {

	public static void main(String[] args) {
		
	}
	public static void sayiBulmaca() {
		int[] sayilar =  new int[] {1,2,3,4,5,6,7,8,9,0};
		int aranacak = 20;
		boolean varMi= false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi = true;
				break;
			}
		}
		
		if (varMi) {
			mesajVer("Sayı mevcuttur." + aranacak);
		}else {
			mesajVer("Sayı mevcut değildir." + aranacak);
		}
		
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
