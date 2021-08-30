package day07_ifElse;

import java.util.Scanner;

public class C4_IfElse03 {

	public static void main(String[] args) {
		// Soru 3) Kullaniciya yasini sorun, eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”, 
		//65’den buyukse “Emekli olabilirsin” yazdirin
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lütfen yaşınız Giriniz");
		
		int yas =scan.nextInt();
		
		if(yas<=65) {
			
			System.out.println("Emekli olamazsın");
		} else {
		
		System.out.println("Emekli olabilirsin");
		
		}
		
		scan.close();
	}


}
