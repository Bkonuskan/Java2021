package day06_relationalOperators_ifstatement;

import java.util.Scanner;

public class C3_IfStatements02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		
		int girilenSayi=scan.nextInt();
		if(girilenSayi%2==0) {
		System.out.println("Girdiğiniz sayi çift sayi");
}
		if(girilenSayi%2==1) {
			System.out.println("Girdiğiniz sayi Tek sayi");
	}
		if(girilenSayi%2<0) {
			System.out.println("Lütfen pozitif bir sayi giriniz");
	}
	}

}
