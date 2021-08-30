package day33_stringBuilder01;

public class C01_StringBuilder {

	public static void main(String[] args) {
		 //83. satırdan sonra buraya yapıştır Haluk hocanın dersini
		
		//String ile StringBuilder karsilastirmasi: == equals -->
	    //SB de eguals metodu string classından farkli calisir.String clsassindaki == operatoru ile ayni 
	    //islemi yapar.. HEm icerik hemde referans aesitligine bakar.
	    
	    String s="hayat";
	    StringBuilder sb =new StringBuilder("hayat");
	    
	    //System.out.println(s==sb);// --> farkli data type ları karsılastima operotoru derlemeyez CTE verir.
	    
	    System.out.println(s.equals(sb));//false
	    
	//SB toString methodu ile stringe cevirelerek string manipulation methodalri kullanilabilir .
	    
	    System.out.println(s.equals(sb.toString()));//true--> string-string karsilastirması equals metodu normal calistir. sadece icerige bakar
	    System.out.println(sb.equals(sb.toString()));//false-->sb-string karsilastirması equals metodu normal degil == gibi calisir. sadece icerige degil icerik ve ref bakar
	    //StringBuilder inedx parametreli appent: farkli string den parca ekleme --> 
	    
	    System.out.println(sb.toString().concat("guzel"));
	    System.out.println(sb);
	    System.out.println(sb.append(s));//sb ye s nin 2 ile 5 arasini appent et ekle
	    

	}

}
