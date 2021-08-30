package day10_stringManipulations;

import java.util.Scanner;

public class C4_StringManipulation4 {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		// - Girilen kelime cumlede kullanilmamis.
		 //- Girilen kelime cumlede 1 kere kullanilmis.
		 //- Girilen kelime cumlede 1’den fazla kullanilmis.

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen bir cümle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		System.out.println("Lütfen kelime giriniz");
		String kelime=scan.next().toLowerCase();
		
		int ilkKullanimIndexi= cumle.indexOf(kelime);//0
		int sonKullanimIndexi= cumle.lastIndexOf(kelime);//16
		
		if (ilkKullanimIndexi==-1) {
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (ilkKullanimIndexi==sonKullanimIndexi) {
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
        } else {
            System.out.println("Girilen kelime cumlede birden fazla kullanilmis.");
        }
            
        
        
        
        
        
        
    }

		
		
		
		
		
		
		
		
		
		
		
	}

