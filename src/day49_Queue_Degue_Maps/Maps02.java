package day49_Queue_Degue_Maps;

import java.util.HashMap;

public class Maps02 {
	public static void main(String[] args) {

		HashMap<Integer, String> m1 = new HashMap<>();
		m1.put(101, "Levent");
		m1.put(102, "Said");
		m1.put(103, "Hasan");
		m1.put(104, "Canan");
		m1.put(105, "Ayse");

		System.out.println(m1); // {101=Levent, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}

		m1.put(101, "harun"); // key values!i update edilir eski veri uzerine yeni girilen veri yazilir
		System.out.println(m1); // {101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}

		m1.put(106, "Canan"); // aynı value farkli key'e atanabilir
		System.out.println(m1); // {101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
								// Value'ler unique olmak zorunda degil...

		m1.put(null, "haluk"); // key degeri null alabilir
		System.out.println(m1); // {null=haluk, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}

		m1.put(null, "hakan");
		System.out.println(m1); // {null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}

		m1.put(107, null); // Value degerleri coklu null olabilir
		m1.put(108, null); // Value degerleri coklu null olabilir
		m1.put(109, null); // Value degerleri coklu null olabilir
		System.out.println(m1); // {null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan,
								// 107=null, 108=null, 109=null}
		System.out.println(m1.get(103)); // Hasan

		System.out.println(m1.values()); // [hakan, harun, Said, Hasan, Canan, Ayse, Canan, null, null, null]
		// --> map'deki tüm elemanlarin value'lerini return eder.

		System.out.println(m1.keySet()); // [null, 101, 102, 103, 104, 105, 106, 107, 108, 109]
		System.out.println(m1.getOrDefault(106, "boyle bir eleman yoktur")); // canan
		System.out.println(m1.getOrDefault(111, "boyle bir eleman yoktur")); // boyle bir eleman yoktur.

		m1.putIfAbsent(110, "ahmet");// belirtilen key creat edilmemisse creat edip value atamasi yapar-->key 110
										// yoktu olusturup ahmet atadi
		System.out.println(m1.putIfAbsent(110, "ahmet"));// belirtilen key yoksa NULL return eder
		System.out.println(m1);// {null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan,
								// 107=null, 108=null, 109=null, 110=ahmet}

		m1.putIfAbsent(105, "salih");// --> 105 Key'de Ayse value oldg icin salih put edilmedi
		System.out.println(m1.putIfAbsent(105, "salih"));// 105 key'deki value degeri Ayse return edildi
		System.out.println(m1);// {null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan,
								// 107=null, 108=null, 109=null, 110=ahmet}

		m1.putIfAbsent(null, "ipek");// null Key'de hakan value oldg icin ipek put edilmedi
		System.out.println(m1);// {null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan,
								// 107=null, 108=null, 109=null, 110=ahmet}

		m1.putIfAbsent(107, "oguz");// 107 Key'de value null oldg icin oguz put edildi
		System.out.println(m1);// {null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan,
								// 107=oguz, 108=null, 109=null, 110=ahmet}

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		HashMap<Integer, String> m3 = new HashMap<>();
		m3.put(101, "Levent");
		m3.put(102, "Said");
		m3.put(103, "Hasan");
		m3.put(104, "Canan");
		m3.put(105, "Ayse");
		System.out.println(m3);// {101=Levent, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}

		m3.remove(101); // belirtilen key'deki Entry : key+value silinir
		System.out.println(m3); // {102=Said, 103=Hasan, 104=Canan, 105=Ayse}

		m3.remove(102, "said"); // key value eslesmsi olursa entry silinir eslesme olmazsa (said!=Said) herhangi
								// bir islem yapilmaz.
		System.out.println(m3); // {102=Said, 103=Hasan, 104=Canan, 105=Ayse}
		m3.remove(102, "Said");
		System.out.println(m3); // {103=Hasan, 104=Canan, 105=Ayse}

		m3.remove(111, "salih"); // olmayan key'deki entry'i silme islemi yapilmaz
		System.out.println(m3.remove(111, "salih"));// false
		System.out.println(m3); // {103=Hasan, 104=Canan, 105=Ayse}

		System.out.println(m3.size());// 3

		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		HashMap<Integer, String> m4 = new HashMap<>();
		m4.put(1, "guzel");
		m4.put(2, "insan");
		m4.put(3, "javacan");

		System.out.println(m4);

		m3.putAll(m4);// m1 map'e m2 put edildi. dolayisyle m1 update oldu ancak m2 ayni degerde.
		// Trick of day : putAll() methodu calismasi icin her iki map'in Data type'lari eslesmeli
		
		System.out.println(m3);// {1=guzel, 2=insan, 3=javacan, 103=Hasan, 104=Canan, 105=Ayse}

		m3.compute(103, (key, value) -> "haluk"); // 103 key'de value varsa update eder yoksa Entry' put eder
		System.out.println(m3);// {1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse}
		// --> 103 key'dekihasan haluk olarak update edildi.

		m3.compute(109, (key, value) -> "merve hanım"); // 109 key'de olnadigi icin Entry' put eder
		System.out.println(m3);// {1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=merve hanım}
		// --> 109 key'deki 109=merve hanım creat edildi...

		m3.computeIfAbsent(111, value -> "said ipek");
		// map'de 111 key varligini kontrol eder 111 key yoksa girilen value(said ipek) atanir. 
		// 111 key varsa islem yapilmaz
		System.out.println(m3);// {1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=merve hanım,111=said ipek}
		// --> 111 key'deki 111=said ipek creat edildi

		m3.computeIfAbsent(109, value -> "ipek"); // map'de 109 key varligini kontrol eder. 109 key oldg icin islem yapilmaz
		System.out.println(m3);// {1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse,109=merve hanım, 111=said ipek}
		
        m3.computeIfPresent(109,(key,value)-> "rabia");//map'de 109 key varligini kontrol eder. 109 key oldg icin rabi value ile update edildi
        System.out.println(m3);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=rabia, 111=said ipek}

        m3.computeIfPresent(115,(key,value)-> "rabia");//map'de 115 key varligini kontrol eder. 115 key oldmadig icin herhnagi bir islem yapilmaz
        System.out.println(m3);//{1=guzel, 2=insan, 3=javacan, 103=haluk, 104=Canan, 105=Ayse, 109=rabia, 111=said ipek}

	}
}