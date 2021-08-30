package day50_Maps;

import java.util.Hashtable;

public class HashTable01 {

	public static void main(String[] args) {
		/*
		 * 1) HashMap ve TreeMap synchronized ve thread-safe degildir. Map'ler arasindan
		 * synchronized ve thread-safe olan bir map'e ihtiyac vardir. Bu yuzden
		 * Hashtable olusturulmustur.
		 * 
		 * 2) Hashtable TR�CK'i :Hashtable ne key icin ne de value icin "null"
		 * kullanamaaaaaaaz.
		 * 
		 * 3) Hashtable elemanlari rastgele siralar.
		 */

		Hashtable<Integer, String> ht = new Hashtable<>(); // t harfi kucuk olacak dikkat edelim...
		
		ht.put(101, "ferudun");
		ht.put(102, "samet");
		ht.put(103, "ipek");
		ht.put(104, "IPEK");
		ht.put(105, "harun");
		System.out.println(ht);// {105=harun, 104=IPEK, 103=ipek, 102=samet, 101=ferudun}

		// ht.put(null,"ali");//NullPointerException firlatir

		// ht.put(104,null);//NullPointerException firlatir
		System.out.println(ht);
		System.out.println(ht.size());// 5


	}
}