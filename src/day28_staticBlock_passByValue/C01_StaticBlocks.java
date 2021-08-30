package day28_staticBlock_passByValue;

public class C01_StaticBlocks {

	static int sayi=10;
	
	static {
		System.out.println("1.Static çalıştı");
		sayi=20;
	}
	static {
		System.out.println("2.Static çalıştı");
		sayi=30;
	}
	public static void main(String[] args) {
		 
		System.out.println("Main methodun ilk satırından sayi: "+ sayi);

	}
	static {
		System.out.println("Main den sonra Static çalıştı");
		sayi=100;
	}
}
