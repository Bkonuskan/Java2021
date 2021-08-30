package day22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_List01 {

	public static void main(String[] args) {
		
		List<String> isimler = new ArrayList<>();// [Ali, Veli, Ayse, Fatma, Ali]
		isimler.add("Ali");
		isimler.add("Veli");
		isimler.add("Ayşe");
		isimler.add("Fatma");
		isimler.add("Ali");
		
		System.out.println(isimler);
		// ozel bir index'e eklemek isterseniz, o zaman index'li add method'unu kullanmaliyiz
		isimler.add(3, "Nihan");
		System.out.println(isimler); // [Ali, Veli, Ayse, Nihan, Fatma, Ali]
		
		isimler.add(0, "Mehmet");
		System.out.println(isimler);
		
		List<String> yeniList=new ArrayList<>();
				
		yeniList.add("Fırat");
		System.out.println(yeniList);
		// yeniList'in sonuna isimler listesini eklemek istersek 
		yeniList.addAll(isimler);
		System.out.println(yeniList);
		 // bir de int elementlerin oldugu liste olusturalim
		List<Integer> sayilar=new ArrayList<>();
		sayilar.add(5);
		// yeni list'e sayilar list'i ekleyebilir miyim ?
        // farkli bir data turunden liste veya element ekleyemeyiz
        
		
		//yeniList.addAll(sayilar);
		
		
		
		
	}
}
