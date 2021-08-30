package day37_İnheritance02;

public class Animal {

	
	// Animal--Mammal--Cat

/*
 * 1) Animal isiminde class creat edip 2 farkl� methoda prnt komutu yaz�n�z.
 * Animal class'�nda int type biri initialize(assaingmet) edilmi� 
 * digeri initialize(assaingmet) edilmemi� iki farkli instance veriable creat ediniz.
 * Animal class'�nda int p'li ve p'siz iki cons creat ediniz.
 * 
 * 
 * 2)Mammal isiminde class creat edip 2 farkl� methoda prnt komutu yaz�n�z.
 * methodlardan biri parentindeki metod ile ayn� isimde olsun Mammal class'�nda
 * int type initialize(assaingmet) edilmi� biri parentindeki veriable ayn�
 * isimde digeri farkl� isimde iki farkli instance veriable creat ediniz. 
 * Mammal class'�nda char p'li ve p'siz cons creat ediniz. 
 * p'li cons parentindeki p'li cons call etsin. 
 * p'siz cons kendi class'�ndaki p'li cons call etsin
 * 
 * 
 * 3)Cat isiminde class creat edip parentindeki ile ayn� isimde methoda prnt
 * komutu yaz�n�z. Cat class'�nda int type initialize(assaingmet) edilmi� biri
 * parentindeki veriable ayn� isimde digeri farkl� isimde iki farkli instance
 * veriable creat ediniz. Cat class'�nda p'li ve p'siz cons creat ediniz. String
 * p'li cons class�ndaki p'siz cons call etsin ve parentindeki ayn� isimdeki
 * veriable print etsin
 * 
 * 4)Runner class'� creat ederek class ve cons ayn� veya farkl� obj ler creat
 * ederk veriable ve metod call ile yazd�rn�z.
 * 
 * parent --> child animal --> Mammal --> Cat
 * 
 */
	
	public void mA() {
	System.out.println("animal");
}
	public void mM() {
		System.out.println("animal" +"mammal");
	}
	public int a=7;
	public int m;
	
	public Animal() {
		System.out.println("p'siz animal cons");
		
	}
public Animal(int i) {
	System.out.println("int  p'li animal cons");
	}
	
}
	
	