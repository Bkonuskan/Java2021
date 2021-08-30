package day03_datacasting_increment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 
		 System.out.println("Lütfen isminizi ve soyisminizi giriniz, \nisminiz yazdıktan sonra ENTER'a basınız ");

		 String name = scan.nextLine();
		 String surname = scan.nextLine();
		 System.out.println("Isminiz :" + name +"\nSoyisminiz : "+surname+"\nKursumuza katılımınız alınmıştır, Teşekkür ederiz");
		 
		 scan.close();
	}

}
