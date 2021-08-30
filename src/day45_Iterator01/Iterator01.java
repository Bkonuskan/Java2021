package day45_Iterator01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator01 {

	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void main(String[] args) {
		
		List <String> list = new ArrayList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
	
		System.out.println(list);// [A, B, C, D]
		
		// her elemana B ekleyin
		
		for (String each : list) {
			each+= "B";
			System.out.print(each + " "); // AB BB CB DB 
		}
		
		System.out.println(" ");
		
		// Collection da her yapi index i desteklemez..
		// Mesela set de index olmaz...
		// index olmayainca mecburen tum elemanlara ulasmak icin for each kullanilir..
		// Update ve delete yapamayiz..
		// Bunun icin Java iterator interface olusturmustur
	
		Iterator it1=list.iterator(); // new keywordu ile yapmadik..
		// hangi obje uzerinde olusturuyorsak ona gore sekil aliyor...
		// iterator next(), hasNext(), remove() methodlarina sahiptir..
	
		
		// iterator while loop kullanilir..
		while (it1.hasNext()) {
			it1.next();
			it1.remove();
		}
		System.out.println(list); // []
        // ispat icin size ile bakalim uzunluk nedir...
		System.out.println(list.size()); // 0 
		
		
		
		
		
	}

}
