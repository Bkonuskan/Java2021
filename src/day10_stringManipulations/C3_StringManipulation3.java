package day10_stringManipulations;

import java.util.Scanner;

public class C3_StringManipulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Java öğrenmek ne güzel";
		
		System.out.println(str.indexOf("e"));
		System.out.println(str.indexOf(' '));
		System.out.println(str.indexOf("mek"));
		System.out.println(str.indexOf(""));
		System.out.println(str.indexOf("j"));
		System.out.println(str.indexOf("J"));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		if(cumle.indexOf("java")==-1);
		
		
		
		
	}

}
