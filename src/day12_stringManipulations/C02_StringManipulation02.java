package day12_stringManipulations;

import java.util.Scanner;

public class C02_StringManipulation02 {

	public static void main(String[] args) {
		// TO
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen İsminizi giriniz");
		String isim=scan.nextLine();
		System.out.println("Lütfen Soyisminizi giriniz");
		String soyisim=scan.nextLine();
		System.out.println("Lütfen kart numaranızı giriniz");
		String kkNo=scan.nextLine();
		
		
		String isimDuzenlenmis = isim.substring(0, 1).toUpperCase() + //ilk harfi büyük olarak verir
								 isim.substring(1).replaceAll("\\w", "*");	//ilk harften sonraki
								//tüm karakterleri *'a çevirir
		String soyisimDuzenlenmis = soyisim.substring(0, 1).toUpperCase() + //ilk harfi büyük olarak verir
				 soyisim.substring(1).replaceAll("\\S", "*");// Space dışındaki herşeyi çevir demek
															// "\\w", "*" ile de olur
		String kkNoDuzenlenmis = "**** **** **** " + kkNo.substring(15);
		
		 
		System.out.println("İsin-soyisim : " + isimDuzenlenmis+" " + soyisimDuzenlenmis 
				+ "\nkart no :" + kkNoDuzenlenmis);
		
		
	}

}
