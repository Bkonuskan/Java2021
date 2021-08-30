package day09_switchCase;

import java.util.Scanner;

public class C1_SwitchCase01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("haftanın kaçıncı gününde olduğunuzu giriniz");
		int gunNo= scan.nextInt();
		
		switch(gunNo) {
		
		case 1:
		    System.out.println("Bugün Pazartesi");
		    break;
		case 2:
			System.out.println("Bugün Salı");
			break;
		case 3:	
			System.out.println("Bugün Çarşamba");
			break;
		case 4:
			System.out.println("Bugün Perşembe");
			break;
		case 5:
			System.out.println("Bugün Cuma");
			break;
		case 6:
			System.out.println("Bugün Cumartesi");
			break;
		case 7:
			System.out.println("Bugün Pazar");
			break;
			default:
				System.out.println("Lütfen geçerli gün numarası giriniz");
			
		scan.close();
		
		
		}
		
		
		
	}

}
