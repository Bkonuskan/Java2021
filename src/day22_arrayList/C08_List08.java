package day22_arrayList;

import java.util.Arrays;
import java.util.List;

public class C08_List08 {

	public static void main(String[] args) {
		// 

		String arr[]= {"3","5","7"};
		List<String> arrList= Arrays.asList(arr);
		
		System.out.println("List olarak : " + arrList);
		
		arr[1]= "Ali";
		
		System.out.println(arrList);
		
		arrList.set(0, "Ayse");
		
		System.out.println("List : " + arrList);
		System.out.println("array : " + Arrays.toString(arr));

	}

}
