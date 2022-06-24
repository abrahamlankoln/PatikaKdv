import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int fiyat;
		System.out.print("urun fiyat bilgisini giriniz: ");
		Scanner deger = new Scanner(System.in);
		fiyat = deger.nextInt();
		if (fiyat < 1000) {
			System.out.println("kdv'siz fiyat: " + fiyat);
			System.out.println("kdv'li fiyat: " + fiyat * 1.18);
			System.out.println("kdv tutari: " + fiyat * 0.18);
		} else {
			System.out.println("kdv'siz fiyat: " + fiyat);
			System.out.println("kdv'li fiyat: " + fiyat * 1.08);
			System.out.println("kdv tutari: " + fiyat * 0.08);
		}

	}

}
