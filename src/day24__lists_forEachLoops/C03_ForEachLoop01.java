package day24__lists_forEachLoops;

import java.util.ArrayList;
import java.util.List;

public class C03_ForEachLoop01 {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Ayse");
		list1.add("Fatma");
		list1.add("Omer");
		
	List<String> list2=new ArrayList<>();	
		list2.add("Ali");
		list2.add("Kemal");
		list2.add("Hatice");
		list2.add("Fatma");
		list2.add("Omer");
		list2.add("Yusuf");
		
		//Bu listelerdeki isimlerden 4 haften fazla olan isimleri yazdıralım
		//ForEachLoop index veya size bakmadan tek tek tüm elementleri bize getiri
		
		for (String each : list1) {
			if(each.length()>4) {
				System.out.println(each + " ");
			}
		}

	}

}
