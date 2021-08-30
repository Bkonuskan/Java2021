package day06_relationalOperators_ifstatement;

import java.util.Scanner;

public class C5_IfStatements04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lütfen kenar uzunluklarından birini tam sayı olarak giriniz");
				int kenar1=scan.nextInt();
		System.out.println("Lütfen diğer kenar uzunluğunu tam sayı olarak giriniz");
				int kenar2=scan.nextInt();
				
				if (kenar1==kenar2) {
					System.out.println("Girdiğiniz dikdörgen bir kare");
				}
				if (kenar1!=kenar2) {
					System.out.println("Girdiğiniz dikdörgen bir kare değil");
					
				}
		
		
		
	}

}
