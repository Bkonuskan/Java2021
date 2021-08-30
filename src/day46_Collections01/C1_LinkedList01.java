package day46_Collections01;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class C1_LinkedList01 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// linked bagli demektir..
		// linked list te ise her eleman birbirine tren gibi baglidir...
		
		// head --> ilk eleman headdir. sadece adres icerir... son eleman null i point eder...
		// node --> adres ve value den olusur.. 
		
		
		// collections da obje olustururken collections in class mi yoksa interface mi olduguna bakmaliyiz..
		// list olustururken constructor ArrayList olusturuyorduk..

		List<String> list = new ArrayList<>();
		list.add("X");
		list.add("Y");
		
		LinkedList<String> ll1 = new LinkedList();
		
		ll1.add("A");
		ll1.add("B");
		System.out.println(ll1); //[A, B]
		ll1.add(1, "C"); 
		System.out.println(ll1); //[A, C, B]
		ll1.addAll(list);
		System.out.println(ll1); // [A, C, B, X, Y]
		
	    ll1.addAll(2, list);
	    System.out.println(ll1); // [A, C, X, Y, B, X, Y]
		
	    ll1.addLast("K");
		System.out.println(ll1); // [A, C, X, Y, B, X, Y, K]
		
		 ll1.addFirst("D");
			System.out.println(ll1); // [D, A, C, X, Y, B, X, Y, K]
		
	}

}
