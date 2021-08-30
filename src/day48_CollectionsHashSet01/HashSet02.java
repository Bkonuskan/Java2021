package day48_CollectionsHashSet01;

import java.util.*;

public class HashSet02 {
	public static void main(String[] args) {
		/*
		 * İcinde degerleri olan bir array i arraylist e cevirecek return tipi arrayList
		 * olacak bir metod yaziniz. {"reha", "hakan", "haluk", "ipek", "ahsen"}
		 * 
		 * main metod altinda metod ile gelen listeyi kullanarak HashSet, TreeSet ve
		 * linkedHashSet leri doldurun.
		 */

		String arr[] = { "reha", "hakan", "haluk", "ipek", "ahsen" };
		ArrayList<String> list = new ArrayList<>();
		list = cevir(arr);
		System.out.println(list); // [reha, hakan, haluk, ipek, ahsen]

		HashSet<String> hs = new HashSet<>(list);
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>(list);
		
		TreeSet<String> ts = new TreeSet<>(list);
		
		System.out.println("hurra :" + hs); // hurra :[ahsen, hakan, reha, ipek, haluk]
		System.out.println("giris sirasi :" + lhs); // giris sirasi :[reha, hakan, haluk, ipek, ahsen]
		System.out.println("alfabetik sira :" + ts); // alfabetik sira :[ahsen, hakan, haluk, ipek, reha]

	}

	public static ArrayList<String> cevir(String[] arr) {
		ArrayList<String> ArrList = new ArrayList<>();
		for (String w : arr) {
			ArrList.add(w);
		}

		return ArrList;
	}
}