package day31_varargs;

public class C03_Varags3 {

	public static void main(String[] args) {
		/*verilen int lerden ilki haric tum sayilari toplayan ve
           buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin 
		 */
            toplama(2,25,55,45);
        
        
    }
    public static void toplama(int sayi1,int...sayi) {
        int toplam=0;
        for (int each : sayi) {
            toplam+=each;
        }
        System.out.println(sayi1*toplam);
	}

}
