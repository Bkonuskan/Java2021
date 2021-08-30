package day07_ifElse;

import java.util.Scanner;

public class C3_IfElse02 {

	public static void main(String[] args) {
		//  
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen bir karakter Giriniz");
		
		char karakter=scan.next().charAt(0);
		
		if(karakter>='A'&& karakter<='Z' || karakter>='a' && karakter<='z') {
			
			System.out.println("Girilen karakter harf ");
		} else {
		
		System.out.println("Girilen karakter harf değil");
		
		}
		
		scan.close();
	}

}
