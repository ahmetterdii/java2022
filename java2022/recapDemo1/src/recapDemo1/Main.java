package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 24;
		int sayi2 = 25;
		int sayi3 = 27;
		int enBuyuk = sayi1;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En B�y�k Say� = " + enBuyuk);
	}

}
