package day47_CollectionsSet01;

import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		set1.add("F");
		set1.add("A");
		set1.add("B");
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");
		set1.add("A");
		set1.add("Y");
		
		System.out.println(set1); // [A, B, C, F, Y]
		// Tekrarlari yazdirmaz...
		
		set1.add("E");
		set1.add("N");
		
		System.out.println(set1); // [A, B, C, E, F, Y, N] 
		// Sirlama onemli degildir istedigi gibi yazdirir..
		
		System.out.println(set1.hashCode()); // 504
		// hashCode() methoodu tum node larin toplam koduunu verir...

	}

}
