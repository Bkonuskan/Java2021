package day44_AbstractClases03;

   // Sorunun 2. kismi burdan devam ediyor...
   // 2) Banka class'in sub class'i BenimHesabim class creat ediniz
   // p'li bakiye print eden constructor creat ediniz...

public class BenimHesabim extends Banka {

	@Override
	double paraYatir(double miktar) {
		super.bakiye += miktar;
		return bakiye;
	}

	@Override
	double paraCek(double miktar) {

		super.bakiye -= miktar;
		return bakiye;
	}

	public BenimHesabim(double bakiye) {
		super.bakiye = bakiye;
		System.out.println(bakiye);

	}
}