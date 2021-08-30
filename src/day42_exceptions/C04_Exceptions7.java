package day42_exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_Exceptions7 {

	public static void main(String[] args) {
		 
		int []arr= {1,2,3,4};
		
		System.out.println(arr[1]);//2
		System.out.println(arr[3]);//4
		//System.out.println(arr[5]);//ArrayIndexOutOfBoundsException unchecked
		
		List<String> guzel=new ArrayList<>(Arrays.asList("Merve","Hakan","Fırat"));
		
		System.out.println(guzel.get(0));
		System.out.println(guzel.get(2));
		//System.out.println(guzel.get(5));//IndexOutOfBoundsException unchecked
		
		//Array ve List lerde olmayan bir index ile işlem yapılırsa
		//Java IndexOutOfBoundsException unchecked hatası verir
		
		
	}

}
