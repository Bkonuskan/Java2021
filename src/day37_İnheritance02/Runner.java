package day37_İnheritance02;

public class Runner {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		Cat c1 = new Cat(); // p'siz cons ile obj Data type Cat class�ndan
		/*
		 * ayn� isimli veriable'ler obj. call edilirken once obj kendi class�ndaki
		 * veriable call edilir. sonra parentindeki veriable call edilir.
		 */

		System.out.println(c1.a);// 7 animal
		System.out.println(c1.c);// 9 kendi class c mammal dan de�il
		System.out.println(c1.d);// 5 kendi class
		System.out.println(c1.m);// 4 mammal

		c1.mM();// animalmammal Animal class-->call
		c1.mC();// cat Cat class-->call
		c1.mA();// mammal Mammal class-->call

		/*
		 * Method call edilirken ayn� isimli methodlar�n hangisinin al�ncag�na const
		 * karar verir. childen parente do�ru hiyararsi yapilir.babadan dedeye once
		 * kimde bulursa onu alir. Data Type ve Consctructor farkli classlar-->Parent
		 * obj =new Child(); parent class'dan baslanir child classdan de�il
		 * 
		 *
		 */

		Mammal c2 = new Cat(); // c2 obj kendi class'� mammal

		System.out.println(c2.a);// 5 Animal class-->call
		System.out.println(c2.c);// 7 Mammal class-->call
		System.out.println(c2.m);// 4 Mammal class-->call

		c2.mA(); // mammal mammal cons--> call
		c2.mC(); // cat cat cons-->call
		c2.mM(); // animal mammal animal cons-->call

		Mammal m1 = new Mammal();
		Animal c3 = new Cat();
        //m1 ve c3 obj uzerinden veriable ve method call???
	}
}
