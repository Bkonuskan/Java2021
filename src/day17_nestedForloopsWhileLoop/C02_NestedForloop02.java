package day17_nestedForloopsWhileLoop;

import java.util.Scanner;

public class C02_NestedForloop02 {

	public static void main(String[] args) {
		/*Soru 13 ) Kullanicidan pozitif bir rakam girmesini isteyin 
		 * ve girilen rakama gore carpim tablosu olusturun. Ornek,kullanici 3 girerse,
 			1 2 3
 			2 4 6
 			3 6 9 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen pozitif bir tam sayı giriniz.");
		int rakam = scan.nextInt();
		
		for (int i = 1; i <=rakam ; i++) {
			 			
			for (int j = 1; j <=rakam ; j++) {
				System.out.print(i*j +" ");			
						
			}
			
			System.out.println("");
		
		}
		}
	}


