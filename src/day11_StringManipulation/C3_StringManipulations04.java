package day11_StringManipulation;

public class C3_StringManipulations04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String kkNo="Java 123 *!";
		System.out.println(kkNo.replace(" ",""));
		System.out.println(kkNo);
		
		//replaceAll
		
		System.out.println(kkNo.replaceAll("\\s", ""));//sadece spece
		System.out.println(kkNo.replaceAll("\\s", "*"));
		System.out.println(kkNo.replaceAll("\\S", "*"));// S space olmayan herşey
		System.out.println(kkNo.replaceAll("\\w", "-"));
		System.out.println(kkNo.replaceAll("\\W", "?"));
		System.out.println(kkNo.replaceAll("\\d", "0"));
		System.out.println(kkNo.replaceAll("\\D", "a"));
		
		
	}

}
