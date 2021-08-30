package day15_forloops;

public class C02_ForLoop01 {

	public static void main(String[] args) {
		// 10 dan 20 ye kadar olan sayıları yazdıran bir loop oluşturalım.
	
		for(int i=10 ; i<=20; i++) {
			System.out.print(i+" ");
			
			
		}
		
		//100 ile 200  dahil aradaki 10 ile bölünen sayıları yazdırın
		System.out.println("");
		for(int i=100 ; i<=200; i+=10) {
			System.out.print(i+" ");
		
		}
		//50 den 10 ye kadar sınırlar dahil 3 er 3 er geriye sayarak yazdıralım
		System.out.println("");
		for(int i=50 ; i>=10; i-=3) {
			System.out.print(i+" ");
		
		}
		
		//50 ile 100 arasında 3 ile bölüne bilen sayıları yazdırınız.
		System.out.println("");
		for(int i=50 ; i<=100; i++) {
			
			if(i%3==0) {
				System.out.print(i+" ");
			}
			
		
			
			
			
			
		}
	}
	

}
