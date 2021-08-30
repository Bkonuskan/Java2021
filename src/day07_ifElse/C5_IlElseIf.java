package day07_ifElse;

import java.util.Scanner;

public class C5_IlElseIf {

	public static void main(String[] args) {
		 
		 //	Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin
		// eger uzunluklardan birisi 0 veya daha kucukse
		// "gecerli uzunluk giriniz" yazdirin,
		// uzunluklarin ikisi de pozitif ise
		// dikdortgenin kare olup olmadigini yazdirin		 
			
		Scanner scan = new Scanner(System.in);
			
			System.out.println("Lütfen dikdörtgenin kenarlarını giriniz \nIlk kenarı girince Enter a basiniz");
			
			double kenar1=scan.nextDouble();
			double kenar2=scan.nextDouble();
			
			if (kenar1<=0 || kenar2<=0) {
			System.out.println("Lütfen geçerli bir uzunluk giriniz");
			
			}else if (kenar1==kenar2){
			System.out.println("Girdiğiniz dikdörgen karedir");			
		    } else {
			System.out.println("Girdiğiniz dikdörgen karedeğildir");
		
		
		  }
			scan.close();
		}
		
	  }


