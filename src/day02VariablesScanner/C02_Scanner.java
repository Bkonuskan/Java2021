package day02VariablesScanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Lutfen iki tam sayi giriniz = ");
		 int sayi1 = scan.nextInt();
		 int sayi2 = scan.nextInt();
		
		 System.out.println(" Girdiginiz sayilarin toplami : " + (sayi1 + sayi2 ));
scan.close();
	}

}
