package day03_datacasting_increment;

import java.util.Scanner;

public class C2_Scanner02 {

	public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.println("Lütfen isminizi giriniz");
    
    char ilkHarf = scan.next().charAt(0);
	System.out.println("Girdiğiniz kelimenin ilk harfi : " + ilkHarf);	
		
		scan.close();

	}

}
