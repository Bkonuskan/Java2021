package day46_Collections01;

import java.util.LinkedList;

public class C2_LinkedList02 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		LinkedList<Object> ll1 = new LinkedList();

		ll1.add("A");
		ll1.add(20);
		ll1.add('C');
		System.out.println(ll1); // [A, 20, C]
	
		// not : String olunca kabul etmedi ama atasi olan object yapinca kabul etti..
		
		
		LinkedList ll2 = new LinkedList();

		ll2.add("A");
		ll2.add(25);
		ll2.add('K');
		System.out.println(ll2); // [A, 25, K]
		
		// object veya string yazmadan da kabul etti...
		
		LinkedList<String> ll3 = new LinkedList();

		ll3.add("X");
		ll3.add(""+28);
		ll3.add(""+'V');
		System.out.println(ll3); // [X, 28, V]
		
		// Bu 3 yol arasinda en hizli 3. sudur..
		
		
		

		System.out.println(System.currentTimeMillis()); // alttakine gore 8milisaniye daha hizli
		for (int i = 0; i < 1000; i++) {
	
		ll1.add("A"+i); // concat yapar
		ll1.add(20+i); // toplama yapar
		ll1.add('C'+i); // ascii gonderir...
		
		}
		
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000; i++) {
	
		ll2.add("A"+i);
		ll2.add(25+i);
		ll2.add('K'+i);
		
		}
		
		
		
		
		
		
		
		
	}

}
