package day47_CollectionsSet01;

import java.util.HashSet;
import java.util.Set;

public class HashSet01 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Verilen bir Array deki tekrarli elemanlari silip
		// Unigue elemanlardan olusan bir Array e ceviren bir metod yaziniz

		int arr[] = { 2, 3, 4, 3, 5, 3, 6, 4, 7, 4, 8, 5 };

		int tekrarsizArray[] = tekrarlariSil(arr);

	}

	@SuppressWarnings("unused")
	public static int[] tekrarlariSil(int[] arr) {

		Set<Integer> set1 = new HashSet<>();

		for (Integer each : arr) {
			set1.add(each);
		}
		System.out.println("Set olarak method icinde : " + set1); // Set olarak method icinde : [2, 3, 4, 5, 6, 7, 8]

		int tekrarsizArray[] = new int[set1.size()];

		int index = 0;
		for (int each : set1) {
			tekrarsizArray[index] = each;
			index++;
		}

		return tekrarsizArray;
	}

}
