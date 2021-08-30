package day45_Iterator01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator04 {

	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {

		// [2,13,56,23,45,14,40] istenen listeyi iterator kullanarak sondan basa dogru sirala...

		List<Integer> sayiListesi = new ArrayList<>();

		sayiListesi.add(2);
		sayiListesi.add(13);
		sayiListesi.add(56);
		sayiListesi.add(23);
		sayiListesi.add(45);
		sayiListesi.add(14);
		sayiListesi.add(40);

		System.out.println(sayiListesi); // [2, 13, 56, 23, 45, 14, 40]

		// sondan basa dogru siralayin...

		ListIterator li1 = sayiListesi.listIterator();

		while (li1.hasNext()) {
			li1.next(); // bu sona gitmeyi saglayacak ve asagidaki while da tersten siralayacak

		}

		while (li1.hasPrevious()) {
			System.out.print(li1.previous() + " "); // 40 14 45 23 56 13 2
		}

		System.out.println(" ");
		System.out.println(sayiListesi); // [2, 13, 56, 23, 45, 14, 40]

	}

}
