package day02VariablesScanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz ");
		String name = scan.next();
		
		System.out.println("Lutfen soyisminizi giriniz ");
		String surname = scan.next();
		
		System.out.println("Isim - soyisim : " +name + " " +surname);
		
		scan.close();
		
		
		
		
	}

}
