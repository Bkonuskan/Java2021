package day09_switchCase;

public class C4_StringManipulation {

	public static void main(String[] args) {

		String isim="Basri";
		String soyisim= "Konuskan";
		
		System.out.println(isim +" "+ soyisim);
		
		System.out.println(isim.concat(" ").concat(soyisim));
		
		System.out.println(isim.charAt(2));//s
		System.out.println(isim.charAt(4));//i
		//System.out.println(isim.charAt(6));//error verir cünkü kelimemiz 5 harfli
	}

}
