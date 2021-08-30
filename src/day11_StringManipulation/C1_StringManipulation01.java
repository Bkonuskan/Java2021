package day11_StringManipulation;

import java.util.Scanner;

public class C1_StringManipulation01 {

	public static void main(String[] args) {
		// Kullanıcıdan bir cümle ve kelime alın
		//Cümlede kelimenin kullanıp kullanılmadığını yazdırın
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Lütfen bir cümle giriniz");
			String cumle=scan.nextLine().toLowerCase();
			
			System.out.println("Lütfen bir kelime giriniz");
			String kelime=scan.nextLine();
			
			if (cumle.indexOf(kelime)!=-1) {
				System.out.println("Kelime cümlede kullanılmış");
								
			}else {
				System.out.println("Kelime cümlede kullanılmamış");
			}

			if(cumle.contains(kelime)) {
				System.out.println("Kelime cümlede kullanılmış");
			}else {
				System.out.println("Kelime cümlede kullanılmamış");
			}
	}

}
