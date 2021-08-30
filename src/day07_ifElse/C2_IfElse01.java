package day07_ifElse;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		//ve dikdortgenin kare olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen dikdörtgenin kenarlarını giriniz \nIlk kenarı girince Enter a basiniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
		System.out.println("Girdiğiniz dikdörgen kare");
		}else {
		System.out.println("Girdiğiniz dikdörgen kare değil");
		
	}
		scan.close();
	}
	
}
