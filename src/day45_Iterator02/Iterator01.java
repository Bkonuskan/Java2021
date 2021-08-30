package day45_Iterator02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import java.util.List;

public class Iterator01 {

	@SuppressWarnings({ "unused", "rawtypes" })
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("t", "a", "r", "i", "k"));
		
		System.out.println("Listin ilk hali : " + list); // Listin ilk hali : [t, a, r, i, k]
		
		// for ile
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ " "); // t a r i k 
		}
		System.out.println(" ");
		
		// for each ile
		for (String w : list) {
			System.out.print(w + " "); // t a r i k 
		}
		
		System.out.println(" ");
		
		// list elemanlarini kullarak :) gulen surati koyunuz..
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+ ":)"); // t:)a:)r:)i:)k:)
	}
		
		System.out.println(" ");
		System.out.println(list);// [t, a, r, i, k]
		// list degisikliklerden sonra da hala ayni...
		
		List<String> list1 = new ArrayList<>(Arrays.asList("t", "a", "r", "i", "k"));

		Iterator it1=list1.iterator();
		
		while (it1.hasNext()) {
		      it1.next();
		      it1.remove();
		}
		System.out.println(list1); // []
	
		
		
		
		
		
		
		
		
		
		
}
}