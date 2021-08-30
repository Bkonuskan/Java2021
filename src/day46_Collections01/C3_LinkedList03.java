package day46_Collections01;

import java.util.LinkedList;

public class C3_LinkedList03 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {


		LinkedList<String> ll1 = new LinkedList();

		ll1.add("A");
		ll1.add("B");
		ll1.add("C");
		System.out.println(ll1); // [A, B, C]
		
		ll1.remove();
		System.out.println(ll1); // [B, C]
		
		ll1.remove(1); // indexteki elemani siler...
		System.out.println(ll1); // [B]

		ll1.remove("B");
		System.out.println(ll1); // []
		
		
	
	
	
	}
	

}
