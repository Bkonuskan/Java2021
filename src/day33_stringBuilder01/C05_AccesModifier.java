package day33_stringBuilder01;

public class C05_AccesModifier {
	
	String defaultName="murat bey";
	private String privateName="hakan inal";
	protected String protectedName="hakan tetik";
	public String publicName="dayanch bey";
	
	/*
    Erişim alanları :
1- Class ın içi
2- Paketin içi
3- Projenin içi (yani diğer paketler)
Public : Projenin her tarafından erişilebilir, yani diğer paketlerden bile. (Class, field, properties, metodlarda, constructor)
default: Yani hiç bir şey yazılmazsa, yani diğer adı friendly : sadece paketin içindekiler erişebilir. (Class, field,properties metodlarda, constructor)
private: Sadece içinde bulunduğu sınıf tan erişilebilir.(field,properties, metodlarda)
   1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
       Baska class'lardan "private" class memler'lari (field,properties, metodlarda, constructor)kullanmak mumkun degildir.
       
       2) Baska package'lerden object olusturursaniz object olusturulan class'i import etmeniz gerekir.
       
       3) Baska package'lerden default class memberlara ulasamazsiniz. Ayni package'de iseniz
       ulasabilirsiniz. "default" ile "package private" es anlamlidir.
       
       4) public class member'lara herkes her yerden ulasabilir(farkli java projesi disinda).
       
        5) "protected" class member'lara ayni package icindeyseniz ulasabilirsiniz. Farkli package'de
        iseniz iki durum var : a)Child class iseniz ulasabilirsiniz.   b)Child class degil iseniz ulasamazsiniz.
        
        6) Class'larda da access modifier kullanilir. Ama sadece "public" ve "default" kullanilir.
        Class olustururken "private" veya "protected" access modifier kullanilmaz.

*/

	 

	}


