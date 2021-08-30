package day04_increment_matematik;

public class C2_PreIncrement_PostIncrement {

	public static void main(String[] args) {
		 
		int sayi1=20;
		System.out.println(sayi1);
		int sayi2=++sayi1;
		System.out.println(sayi1);
		
		System.out.println("Pre-increment sayi1 : " + sayi1); //21
		System.out.println("Pre-increment sayi2 : " + sayi2); //21
		
        sayi2=sayi1++; // sayi2:21 sayi1:22
		
		System.out.println("Post-increment sayi1 : " + sayi1);// 22
		System.out.println("Post-increment sayi2 : " + sayi2);//21

		int sayi3=10;
				
		System.out.println("Pre-increment sayi1 : " + ++sayi3);// 11
		System.out.println("Post-increment sayi2 : " + sayi3++);//11
		System.out.println("Post-increment'tan sonra sayi3 : " + sayi3);//12
		
		
		
		
		
		
	}

}
