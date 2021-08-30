package day50_Maps;

import java.util.HashMap;

public class Ex01 {
	public static void main(String[] args) {
        //  Ad ve soyad bulunduruan iki ayr� array'i ad=soyad  seklinde yazd�r�n�z.
    	
        // input : {"ahmet", "ahmet can", "haluk"};  {"�eref", "erdem", "bilgin"};
        // output : {ahmet=�eref, ahmet can=erdem, haluk=bilgin};

        String ad[] = {"ahmet", "ahmet can", "haluk"};
        String soyad[] = {"�eref", "erdem", "bilgin"};

        HashMap<String, String> adSoyad = new HashMap<>();
        for (int i = 0; i < ad.length; i++) {
            adSoyad.put(ad[i], soyad[i]);

        }
        System.out.println("adSoyad = " + adSoyad);//adSoyad = {ahmet=�eref, ahmet can=erdem, haluk=bilgin}
        
        
        /*
         * 2. yol
         * 
        String arr[] = { "ahmet", "ahmet can", "haluk" };

		String arr2[] = { "�eref", "erdem", "bilgin" };

		HashMap<String, String> hm = new HashMap<>();

		for (int i = 0; i < arr2.length; i++) {

			hm.put(arr[i], arr2[i]);
		}

		System.out.println(hm);
		*/
         

    }
}