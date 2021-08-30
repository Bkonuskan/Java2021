package day38_inheritance._12_Inheritance_04;

public class Runner {

	public static void main(String[] args) {
		/*
		 * kendi classındaki variable call edilir
		 * Sonra parentteki veriable alttan yukarı dogru call edilir
		 */

		Cat c1=new Cat();//parametresiz Constructer
		System.out.println(c1.a);//7 animaldan
		System.out.println(c1.c);//7 kendi class c'den  mammal dan değil
		System.out.println(c1.d);//5 kendi class
		System.out.println(c1.m);//4 mammal
		
		c1.mA();//Mammal dan
		c1.mC();//Cat ten aldı
		c1.mM();//Animaldan geldi
		
		
		
		Mammal c2=new Cat("X");
		
		System.out.println(c2.a);//animal  veriable çağırıyoruz
		System.out.println(c2.c);//mammal
		System.out.println(c2.m);//mammal
		
		c2.mA();//mammal dan Method çağırıyoruz
		c2.mC();//mammal dan
		c2.mM();//Animaldan gelir
		
	}
}
