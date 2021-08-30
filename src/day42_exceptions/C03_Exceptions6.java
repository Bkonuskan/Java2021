package day42_exceptions;

public class C03_Exceptions6 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str1=" ";//Space
		String str2="";//hiçlik		
		String str3=null;//str3 veriable nin hiç bir değere eşit olmadığını belirtir
		//Null bir değer değildir ama konsola yazdırılır
		
		System.out.println(str1.length());//1
		System.out.println(str2.length());//0
		//System.out.println(str3.length());//NullPointerException unchecked
		System.out.println(str3+" Erol Taş");//nullErol Taş
		System.out.println(str3.concat("Erol Taş"));
		//Null olarak atanmış bir obje ye uygun olamayan bir işlem yapılırsa
		//NullPointerException hatası verir
	}

}
