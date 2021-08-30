package day46_Collections02;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("erdem", "mehmet", "samet", "said", "yagmur"));

		System.out.println(ll1); // [erdem, mehmet, samet, said, yagmur]

		ll1.add("merve"); // --> add yapilan node LinkedList'im en sonuna ekler..
		System.out.println(ll1); // [erdem, mehmet, samet, said, yagmur, merve]

		ll1.add(2, "faruk eczanesi"); // --> 2. indexe node eklenir.
		System.out.println(ll1);// [erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve]

		LinkedList<String> ll2 = new LinkedList<>(Arrays.asList("X", "Y"));

		ll1.addAll(ll2);// ll1 sonuna ll2 node larini ekler
		System.out.println(ll1);// [erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, X, Y ]

		ll1.addFirst("gayet");// -->ilk index'e node ekler
		System.out.println(ll1);// [gayet, erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, X, Y]

		ll1.addLast("basarili");// -->son index'e node ekler
		System.out.println(ll1);// [gayet, erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, X, Y, basarili]

		ll1.addAll(3, ll2);// -->3. index'e collection obj ll2 ekler
		System.out.println(ll1); // [gayet, erdem, mehmet,  X, Y, faruk eczanesi, samet, said, yagmur, merve, X, Y, basarili]

		ll1.remove();// ilk node siler ve silinen node'u return eder
		System.out.println(ll1);//[erdem, mehmet, X, Y, faruk eczanesi, samet, said, yagmur, merve, X, Y, basarili]

		ll1.removeFirst(); // ilk node daha hizli siler ve silinen node'u return eder
		System.out.println(ll1); //[mehmet, X, Y, faruk eczanesi, samet, said, yagmur, merve, X, Y, basarili]

		ll1.remove("faruk eczanesi");// faruk eczanesi node'unu siler return true
		System.out.println(ll1); // [mehmet, X, Y, samet, said, yagmur, merve, X, Y, basarili]

		ll1.remove(2);// 2. index'deki nodu'siler node'u return eder
		System.out.println(ll1);// [mehmet, X, samet, said, yagmur, merve, X, Y, basarili]

		ll1.removeFirstOccurrence("X");// ilk gorulen node silinir
		System.out.println(ll1); // [mehmet, X, samet, said, yagmur, merve, X, Y, basarili]

		ll1.add(3, "basarili"); // [mehmet, X, samet, said, yagmur, merve, X, Y, basarili]
		ll1.removeLastOccurrence("basarili");// son gorulen node silinir
		System.out.println(ll1); // [mehmet, samet, basarili, said, yagmur, merve, X, Y]

		LinkedList<Integer> ll3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
		ll3.remove(2);// 2 node'u degil 2. index'teki 3 node'u siler
		System.out.println(ll3); // [1, 2, 4, 5, 6]

		ll3.remove(ll3.indexOf(6));
		System.out.println(ll3); // [1, 2, 4, 5]

		ll1.removeAll(ll2); // ll1 den ll2 obj siler
		System.out.println(ll1); // [mehmet, samet, said, basarili, yagmur, merve]
		System.out.println(ll2); // [X, Y]

		// ll3.remove(33); olmayan bir index excepion verir...
		// System.out.println(ll3);//IndexOutOfBoundsException firlatir

		System.out.println(ll1.get(4));// yagmur --> get(i) indexteki elemaný return eder

	}
}