package day41_exceptions;

import java.util.Scanner;

public class Exceptions02 {
	
	public static void main(String[] args) {
		
		// Kullanicidan alacaginiz 2 tam sayinin bolumunu yazdiriniz.
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 1;
		
		while (count <= 2) {
			
			System.out.print("Bolunen sayiyi giriniz : ");
			
			int sayi1 = scanner.nextInt();
					
			System.out.print("Bolen sayiyi giriniz : ");
				
			int sayi2 = scanner.nextInt();
			
			try {
				
				System.out.println("Bolum : " + (sayi1 / sayi2));
				
			} catch (ArithmeticException e) {
				
				System.out.println("Hatali giris yaptin, bolme isleminde bolen 0 olamazzzzz!!!!!");
				System.out.println(e.getMessage());//by Zero
				e.printStackTrace();//Hatanın handle ediilmesi için verileri yazdırır.
				
				count++;
				scanner.close();
			}System.out.println("Dewamke");
		}
	}
}

					