package day24__lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C01_List01 {

	public static void main(String[] args) {
		/*Kullanicidan isimler isteyin ve bunlari bir list’te depolayin. 
		 * Kullanici yeter yazana kadar isim istemeye devam edin.
	      Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan kac
	      tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
	 isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
	 Not : kucuk buyuk harf onemli degil*/
		
		Scanner scan=new Scanner(System.in);
		List<String> girilenisimler=new ArrayList<>();
		String isim;
		
		do {
		System.out.println("Lütfen Listeye eklemek için isim giriniz! \nBitirmek için yeter yazınız");	
		isim=scan.nextLine();
		if(!isim.equalsIgnoreCase("yeter")) {
		girilenisimler.add(isim);
		}
		}while(!isim.equalsIgnoreCase("yeter"));
		
		//System.out.println(girilenisimler);
		
		String isimler[]= {"Ali" , "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
		List<String> isimList= Arrays.asList(isimler);
		//Elimizde iki liste var. 1-i Kullanıcıdan
		//2- Karşılaştırma listesi
		
		System.out.println("Toplam :" + girilenisimler.size()+ "isim girdiniz");
		int count=0;
		
		for (int i=0; i<girilenisimler.size(); i++) {
			if(isimList.contains(girilenisimler.get(i))) {
				count++;
			}
		}
		
		System.out.println("Girdiğiniz isimlerden " + count + " tanesi bendeki listede kayıtlı");
		
		scan.close();
		
	}

}
