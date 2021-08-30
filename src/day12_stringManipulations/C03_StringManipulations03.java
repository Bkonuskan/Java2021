package day12_stringManipulations;

import java.util.Scanner;

public class C03_StringManipulations03 {

	public static void main(String[] args) {
		/* Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
 - Ilk harf buyuk harf olmali
 - Son harf kucuk harf olmali
 - Sifre bosluk icermemeli
 - Sifre uzunlugu en az 8 karakter olmali

*/
		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen Şifrenizi giriniz");
		String sifre=scan.nextLine();
		 
		boolean ilkHarfkont = sifre.charAt(0)>='A' && sifre.charAt(0)<='Z';
		boolean sonHarfkont = sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(0)<='z';
		boolean spaceKontrol= !sifre.contains(" ");
		boolean uzunlukKontrol= sifre.length()>=8;
		
		if (ilkHarfkont && sonHarfkont && spaceKontrol && uzunlukKontrol ) {
			System.out.println("Sifre basarı ile tamamlandı");
		}else {
			System.out.println("Işlem basarısız, Lütfen tekrar deneyiniz ");
		}
		
		
		
	}

}
