package day45_Iterator01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("unused")
public class Iterator02 {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
	List <String> list = new ArrayList();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
	
		System.out.println(list);// [A, B, C, D]
		
		// her elemana B ekleyin
		
		ListIterator li1=list.listIterator();
		
		while (li1.hasNext()) {
			
			String temp = (String) li1.next();
			li1.set(temp+"B");
		}
		System.out.println(list); // [AB, BB, CB, DB]
	}

}
