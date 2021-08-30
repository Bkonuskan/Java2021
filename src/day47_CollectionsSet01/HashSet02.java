package day47_CollectionsSet01;

import java.util.HashSet;
import java.util.Set;

public class HashSet02 {

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

		set1.clear();
		System.out.println(set1); // []

		set1.add("F");
		set1.add("A");
		set1.add("B");
		set1.add("A");

		System.out.println(set1); // [A, B, F]

		Set<String> set2 = new HashSet<>();

		set2.add("B");
		set2.add("F");
		set2.add("A");

		System.out.println(set2); // [A, B, F]

		System.out.println(set1.containsAll(set2)); // true

		System.out.println(set1.equals(set2)); // true

		set1.removeAll(set2);
		System.out.println(set1.removeAll(set2)); // false.. 1 tane eslesen olayd true dondururdu..
		System.out.println(set1); // []
		System.out.println(set2); // [A, B, F]

		set1.add("F");
		set1.add("A");
		set1.add("B");
		set1.add("A");
		set1.add("D");

		set1.retainAll(set2); // set1 de calisir set2 deki elemanlari tutar ve  set2 de olmayanlari siler...
		System.out.println(set1); // [A, B, F]
		System.out.println(set2); // [A, B, F]

	}

}
