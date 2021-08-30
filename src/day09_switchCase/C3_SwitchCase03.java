package day09_switchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		//  Kullanicidan gun ismini alip haftaici veya 
		//hafta sonu yazdiralim
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Gün ismi giriniz");
		String gun= scan.next().toLowerCase();
		
		switch(gun) {
		
		case "pazartesi" :
		case "salı" :
		case "carsamba" :
		case "persembe" :
		case "cuma" :
			System.out.println("Girdiğiniz gün hafta içi");
			break;
		case "cumartesi" :
		case "pazar" :
			System.out.println("Girdiğiniz gün hafta sonu");
			break;
			
			default :
				System.out.println("Lütfen geçerli bir gün ismi yazınız");
			
		scan.close();
		}
		

	}

}
