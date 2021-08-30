package day17_nestedForloopsWhileLoop;

import java.util.Scanner;

public class C07_WhileLoop05 {

	public static void main(String[] args) {
		/* Kullanıcıdan toplamak üzere sayı isteyin.
		Toplam 200 oluncaya kadar isteyin.
		Toplam 200 ü geçtiğinde 
		Kullanıcinin kaç sayı giridiğini ve bu sayıların toplamını yazdırın
		*/
		Scanner scan = new Scanner(System.in);
		
		int sayi=0;
		int toplam=0;
		int sayac=0;
		
		while (toplam<200) {
			
			System.out.println("Lütfen toplamak için bir tamsayı giriniz : ");
			sayi=scan.nextInt();
			
			toplam+=sayi;
			sayac++;
			
		}
		System.out.println("toplam " + sayac + " adet sayi girdiniz ve sayiların toplamı : "
				+ toplam);
	}

}
