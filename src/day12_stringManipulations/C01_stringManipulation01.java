package day12_stringManipulations;

public class C01_stringManipulation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Java candır";
		
		System.out.println(str.substring(5));//candır
		System.out.println(str.substring(10));//r
		System.out.println(str.substring(11));//11=length hiçlik yazdırır
		System.out.println("======");
		//System.out.println(str.substring(20)); //hata verir
		
		System.out.println(str.substring(5,8));//can
		System.out.println(str.substring(2,3));//v
		System.out.println(str.substring(5,5));//hiçlik
		System.out.println("*******");
		System.out.println(str.substring(5,11));//candır
		//System.out.println(str.substring(5,1));//
		
		System.out.println(str.substring(3,4) + str.substring(8, 9));//an
		
		
		
		
	}

}
