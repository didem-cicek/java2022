package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int number = -5;
		int remainder = number % 2;
		System.out.println(remainder);
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println(number + "asal değildir.");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz Sayı");
			return;
		}
		
		for(int i = 2; i<number; i++) {
			if (number % i ==0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(number + " asaldır.");
		}else {
			System.out.println(number + " asal değildir.");
		}

	}

}
