package day05_wapper_concantenation;

public class C1_WrapperClass {

	public static void main(String[] args) {

		String isim = "Mehmet";
		int sayi = 10;

		System.out.println(isim.charAt(2));// h

		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE);
		System.out.println(sayi2.MIN_VALUE);

		Short sayi3 = 0;
		System.out.println(sayi3.MAX_VALUE);
		System.out.println(sayi3.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);

		// Wrapper Class kullanımına bir örnek
		String okulNo = "858";// eger string bir veriable sadecede sayılardan
		// oluşuyorsa bu stringi integer e çevire biliriz.

		int okulNoSayiOlarak = Integer.parseInt(okulNo);

		System.out.println(okulNo);

	}

}
