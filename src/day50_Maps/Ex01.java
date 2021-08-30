package day50_Maps;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {
        //  Ad ve soyad bulunduruan iki ayrý array'i ad=soyad  seklinde yazdýrýnýz.
    	
        // input : {"ahmet", "ahmet can", "haluk"};  {"þeref", "erdem", "bilgin"};
        // output : {ahmet=þeref, ahmet can=erdem, haluk=bilgin};

        String ad[] = {"ahmet", "ahmet can", "haluk"};
        String soyad[] = {"þeref", "erdem", "bilgin"};

        HashMap<String, String> adSoyad = new HashMap<>();
        for (int i = 0; i < ad.length; i++) {
            adSoyad.put(ad[i], soyad[i]);

        }
        System.out.println("adSoyad = " + adSoyad);//adSoyad = {ahmet=þeref, ahmet can=erdem, haluk=bilgin}
        
        
        /*
         * 2. yol
         * 
        String arr[] = { "ahmet", "ahmet can", "haluk" };

		String arr2[] = { "þeref", "erdem", "bilgin" };

		HashMap<String, String> hm = new HashMap<>();

		for (int i = 0; i < arr2.length; i++) {

			hm.put(arr[i], arr2[i]);
		}

		System.out.println(hm);
		*/
         

    }
}