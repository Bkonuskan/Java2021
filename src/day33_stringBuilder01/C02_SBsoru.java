package day33_stringBuilder01;

import java.util.Scanner;

public class C02_SBsoru {

	public static void main(String[] args) {
		/*Bir cümleyi parametre olarak kabul eden, 
		 * StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan) bir Java programı yazın.
	       (without case sensitivity)
	       Eg : input : I love Java
	       Output: "Reversed sentence : avaJ evol I .
	          It is not a palindrome"*/
		
		/*String str="Traş neden şart";
		StringBuilder sB=new StringBuilder();
		sB.append(str);
		String terString=sB.reverse().toString();
		
		if(str.equalsIgnoreCase(terString)) {
		System.out.println("Girdiginiz cümle Polindrome ifadedir. "+"\n" +terString);
		}else {
			System.out.println("Girdiginiz cümle Polindrome ifade değildir.");
		}
		
         
        
        StringBuilder sb1 = new StringBuilder ("tras neden sart");
        
        System.out.println(sb1);
        
        sb1.reverse();
        
        System.out.println("Reserved sentence: " + sb1);
        
        if (str.equals(sb1.toString())) {
            
            System.out.println("It  palindrome");
        } else {
            
            System.out.println("It is not a palindrome");
        }*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen Polindrome kontrol ifadesi giriniz");
		String str2=scan.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(str2);
		String tersString=sb.reverse().toString();
		
		if (str2.equalsIgnoreCase(tersString)) {
			
			System.out.println("girdiginiz ifade polindrome'dir : "+tersString);
		} else {
			System.out.println("girdiginiz ifade Polindrome degildir.");
	}scan.close();
	}
}
