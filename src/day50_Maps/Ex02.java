package day50_Maps;

import java.util.HashMap;
import java.util.Scanner;

public class Ex02 {     
	
	/*
    Count the words in a String one by one
    Bir Stringdeki kelimeleri tek tek sayýn ve konsolda yazdiran method creat ediniz.
    String Str = "Ali came to school and Ayse came to school"
    Ali=    1
    came=   2
    to=     2
    school= 2
    and=    1
    Ayse=   1
    */
    
	public static void main(String[] args) {
    
		Scanner scan = new Scanner(System.in);
        System.out.print("bir metin bir  giriniz :");
        String metin = scan.nextLine();
        kelimeSay(metin);
        
        scan.close();
    }

    public static void kelimeSay(String metin) {
        HashMap<String, Integer> map = new HashMap<>();
        String kelime[] = metin.split(" ");

        for (int i = 0; i < kelime.length; i++) {

            if (map.containsKey(kelime[i])) {
                map.put(kelime[i], map.get(kelime[i]) + 1);

            } else {
                map.put(kelime[i], 1);
            }
        }
        System.out.println(map);
        
        /*
         * 2. yol
         * 
         * 
		System.out.println(Arrays.toString(arr));

		int count = 1;
		int count2 = 1;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i].equals(arr[i + 1])) {

				count++;

				if (count >= count2) {

					count2 = count;

				}

			} else {
				count = 1;
			}

			hm.put(arr[i], count2);

		}

		System.out.println(hm);
         */
        
    }
}