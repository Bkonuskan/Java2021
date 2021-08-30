package day45_Interface02;

public class SahinRunner {
	public static void main(String[] args) {
		Sahin s1=new Sahin();
		s1.ayna();
		s1.ebat();
		s1.jant();
		s1.kapi();
		s1.kaporta();
		s1.koltuk();
		s1.motor();
		s1.yakit();
		System.out.println(IcDonanim.MUSIC);
		//s1.kumas="deri";//final veriable assaignment yapilamaz
		
		System.out.println(IcDonanim.RENK); // ahsap
		System.out.println(disDonamim.RENK); // metalik
		System.out.println(Lastik.RENK); // siyah beyaz yanakli
		System.out.println(s1.sisLamp()); // sisli hava dikkat
		// obj ile parent interface'den concrete method call edildi. 
		System.out.println(disDonamim.boya()); // koyu renk boya gunes yanigi yapar
		// interface name ile parent interface'den concrete method call edildi. 
		
	}
}