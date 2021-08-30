package day17_nestedForloopsWhileLoop;

import java.util.Scanner;

public class C01_NestedForloops01 {

	public static void main(String[] args) {
		/*Soru 12 ) Kullanicidan pozitif bir rakam girmesini isteyin
		 *  ve girilen rakama gore asagidaki sekli cizdirin
				
		  			 *
		  			 * *
		  			 * * *
		  			 * * * *
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen pozitif bir tam sayı giriniz.");
		int rakam = scan.nextInt();
		
		for (int i = 1; i <=rakam ; i++) {
			System.out.print("Satır no :" + i);
			
			for (int j = 1; j <=i ; j++) {
				System.out.print(" * ");
				
						
			}
			
			System.out.println("");
		}
		
		
		
		
		
	}

}
