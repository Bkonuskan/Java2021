package day31_varargs;

public class C02_Varargs2 {

	public static void main(String[] args) {
		// Varargs kullanarak verilen Stringleri birlestiren 
		//concat isimli bir method olusturunuz
		concat("m","e","r","v","e");
		
		
	}

	private static void concat(String ...string) {
		String s="";
		for(String w: string) {
			s=s.concat(w).toUpperCase();
		}
		System.out.println(s);
		
	}

}
