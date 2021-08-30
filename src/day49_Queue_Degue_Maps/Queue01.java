package day49_Queue_Degue_Maps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		
		// kuyruga alir... Queue da indexli method yoktur...
		Queue <String> k1=new PriorityQueue<>();
		
		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");
		
		System.out.println(k1); // [A, C, M, D]
		// kendine gore siralama yapar PriorityQueue
		
		
		Queue <String> k2=new LinkedList<>();
		
		k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");
		
		System.out.println(k2); // [D, C, M, A]
		// olusturma sirasina gore yapar LinkedList
		
		k2.offer("Z");
		System.out.println(k2); // [D, C, M, A, Z]
		// add gibi sona ekler ama queue ya hastir...
	
		k2.peek();
		System.out.println(k2); // [D, C, M, A, Z]
		// hic eklme olmadigi icin aynisini verdi
		
		// soyle yaparsak
		System.out.println(k2.peek()); // D
		// ilk elemani silmeden return eder...
		
		System.out.println(k2); // [D, C, M, A, Z]
		
		k2.remove();
		System.out.println(k2); // [C, M, A, Z]
		// FIFO dan dolayi ilk gelen ilk cikar dan ilk harf gitti..
		
		System.out.println(k2.remove("A")); // true
		// icine yazilinca true false dondurur...
		
		System.out.println(k2); // [C, M, Z]
		k2.poll();
		System.out.println(k2); // [M, Z]
		// poll methodu ilk elemani silerek return eder...
		
		// poll bos bir queue da null dondurur..
		// remove ise bos bir queue da exception dondurur..
		
		k2.remove();
		k2.remove();
		k2.remove();
		System.out.println(k2); // NoSuchElementException
		

		// isEmpty bos ise true dolu ise false dondurur..
		// element() methodu ise bos ise NoSuchElementException dondudurur..
		
		
		
		
	}

}
