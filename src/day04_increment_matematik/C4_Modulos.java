package day04_increment_matematik;

import java.util.Scanner;

public class C4_Modulos {

	public static void main(String[] args) {
		 // 5496 sayisinin rakamları toplamını bulalım
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lütfen Bir sayı Giriniz");
		
				
		int sayi = scan.nextInt();
		int rakamlarToplami = 0;
		// bir sayini rakamlar top. bulmak için her basamak değerinde 3 işlen yaparız
		//1- sayı% ile son basamağı elde ederiz
		
		int rakam = sayi%10;
		// 2- bu rakamı rakamlarToplamına ekleriz.
		
		rakamlarToplami += rakam;
		
		// 3- değerin aldığımız son basamaktan kurtulmak için sayıyı 10 böleriz
		//veriable int old. için 6 yı yok sayarak 549 yazacak
		
		sayi/=10;
		// bu satıta geldiğimde sayı 549 , rakamlarToplamı 6 olur
		
		rakam = sayi%10;
		rakamlarToplami += rakam;
		sayi/=10;
		// bu satıta geldiğimde sayı 54 , rakamlarToplamı 15 olur
		
		rakam = sayi%10;
		rakamlarToplami += rakam;
		sayi/=10;
		// bu satıta geldiğimde sayı 5 , rakamlarToplamı 19 olur
		rakam = sayi%10;
		rakamlarToplami += rakam;
		sayi/=10;
		
		// kodumuzun sonunda rakamlar toplamı 24 sayı 0 oldu.
		
		System.out.println("Rakamlar toplamı : " +rakamlarToplami);
scan.close();
	}

}
