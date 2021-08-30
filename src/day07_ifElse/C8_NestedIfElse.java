package day07_ifElse;

import java.util.Scanner;

public class C8_NestedIfElse {

	public static void main(String[] args) {
		// Kullanicidan cinsiyet ve yas aliniz
				// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
				// calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
				// emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin

		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen cinsiyetinizi giriniz \nErkek için E, Kadın için K giriniz");
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen yaşınızı tam sayı olarak giriniz");
		
		int yas=scan.nextInt();
		
		if(cinsiyet=='K') {
			if(yas>=60) {
				System.out.println("Emekli olabilirsin");
				
			}else {
				System.out.println("Emekli olamassin \nDaha " + (60-yas) +"yil çalışmalısın.");
			}
		}else if(cinsiyet=='E'){
			if(yas>=65) {
				System.out.println("Emekli olabilirsin");
				
			}else {
				System.out.println("Emekli olamassin \nDaha " + (65-yas) +"yil çalışmalısın.");
			}
			
		}else {
			System.out.println("Lütfen Erkek için E, Kadın için K giriniz");
		}
		
		
		
	}

}
