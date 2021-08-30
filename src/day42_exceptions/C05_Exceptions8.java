package day42_exceptions;

public class C05_Exceptions8 {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		int sayi=34;
		
		String str="1453";
		
		//String str1=sayi;//CTE checked exception ClassCast
		
		int okulNo=Integer.parseInt(str);
		System.out.println("OkulNo : "+okulNo);
		System.out.println(str+35);//Concat olur 145335  yazdırır
		System.out.println(okulNo+35);//1488
		
		@SuppressWarnings("unused")
		String str1="14a3";
		
		//int strSayi=Integer.parseInt(str1);//NumberFormatException unchecked 
		
		Object sayi3=44;// object
		
		String strSayi2=(String)sayi3;//data Type Class casting büyük veri küçük konteynera atandı
									  //ClassCastException data türleri uygun olmayan işlemlerde verir  unchecked
		
	}
	

}
