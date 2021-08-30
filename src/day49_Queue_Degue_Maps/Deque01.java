package day49_Queue_Degue_Maps;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {


	public static void main(String[] args) {
		// deque cift tarafli demek
		
		Deque<String> dk1=new LinkedList<>();
		
		dk1.add("M");
		dk1.add("A");
		dk1.addFirst("C");
		System.out.println(dk1); // [C, M, A]
		
		dk1.addLast("L");
		System.out.println(dk1); // [C, M, A, L]
		
		System.out.println(dk1.getFirst()); // C
		System.out.println(dk1.getLast()); // L
		
		System.out.println(dk1.pop()); // C ilk harfi kesip alir ve siler
		System.out.println(dk1); // [M, A, L]
		
		dk1.push("Y"); // ilk basa ekler...
		System.out.println(dk1); // [Y, M, A, L]

	}

}
