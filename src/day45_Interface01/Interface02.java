package day45_Interface01;

public interface Interface02 {
	
	
	default void deneme() {
	System.out.println("default calisti");	
	}
	
	static void deneme1() {
		System.out.println("static calisti");
	}
	
	// burdaki default ve static bizim bildigimiz defaul ve static degildir...
	
	// interface de default ve static keyword kullanarak concrete method olusturabiliriz...
	// bu javanin ozel bir cozumudur...
	// burdaki default ve ststic keyword basina yazildigi methodun concrete oldugunu belirtir...
	// bunlar override edilmek ZORUNDA DEGILDIR...
	

}
