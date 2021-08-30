package day45_Iterator02;

import java.util.*;

public class Iterator02 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	
	public static void main(String[] args) {

		// 1. ornek...
		List<String> list = new ArrayList<>(Arrays.asList("t", "a", "r", "i", "k"));

		System.out.println("ilk hali: " + list); // ilk hali: [t, a, r, i, k]

		ListIterator lt1 = list.listIterator(); 
		// listýterator interfaceden lt1 veriable creat edildi. degerini listten assingn edildi
		
		while (lt1.hasNext()) {

			String depo = (String) lt1.next();

			lt1.set(depo + ":-)");// list elemanlarini update etti

		}
		System.out.println("update hali : " + list); // update hali : [t:-), a:-), r:-), i:-), k:-)]
		
		
        // 2. ornek...
		List<String> list1 = new ArrayList<>(Arrays.asList("m", "e", "l", "i", "h", "a"));
		
		// son elemanina :-) ile update ediniz, 
		// elemanlarini sondan basa dogru yazdiriniz--> :-) a h i l e m
		
		System.out.println("ilk hali: " + list1); // ilk hali: [m, e, l, i, h, a]
		
		ListIterator lt2 = list1.listIterator();
		// listýterator interfaceden lt1 veriable creat edildi. degerini listten assingn edildi

		while (lt2.hasNext()) {
			String depo = (String) lt2.next();

			if (!lt2.hasNext()) {
				lt2.set(":-)" + depo);
			}

		}
		// tersten yazdirirsak
		while (lt2.hasPrevious()) {
			String depo = (String) lt2.previous();// cursorun oncesi elemani return eder. ve cursoru oncesine getirir
			System.out.print(depo + " "); // :-)a h i l e m

		}
		System.out.println();
		System.out.println(list1);// [m, e, l, i, h, :-)a]
		
		/*
		 * Tricky  --> hasPrevious() ve previous() method'larinin calimasi icin
		 * oncesinde MUTLAKA KESÝNLÝKLE hasNext() ve next(); method'lari calistirilarak
		 * cursor(pointer) en sona getirilmeli
		 * 
		 * "ITERATOR" ve "LISTITERATOR" arasi farklar :
		 * 
		 * 1) "ITERATOR" sadece hasNext(), next() ve remove() methodlarini icerir
		 * "LISTITERATOR" ise hasNext(), next(),remove() hasPrevius(), Previus(), add();
		 * set() method'rini içerir.
		 * 
		 * 2) "LISTITERATOR" sadece list'ler cin kullanilir. "ITERATOR" ise tum
		 * collection(list set map) elemanlari icin kullanilir
		 * 
		 * 3) "ITERATOR" sadece ileri gidiyor, "LISTITERATOR" hem ileri hem geri cift
		 * yonlu gitmek icin kullanilir.
		 * 
		 */
		
	}
}