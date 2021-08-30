package day15_forloops;

public class C01_MethodCreationTekrar01 {

	public static void main(String[] args) {
		/*oru : Bir oyun programinda oyuncuya 
		 * level ve puanina gore bonus hesaplayan bir method yaziniz.
           Bonus eklendikten sonra oyuncu yeni puaniyla oyuna devam edecek.
           (Oyun icinde birden fazla defa bonus ekleme fonksiyonu kullanilabilir)
			Bonus kurali :
			-ilk 10 level icin mevcut puan 1000’den az ise 50, 1000 veya cok ise 100 bonus
			-11-50 level arasi mevcut puanin yuzde 10’u kadar bonus
			-51.levelden itibaren puan 10.000’den az ise 1000 bonus, 10.000 den coksa mevcut puanin %15 kadar bonus
		 		 */
		
		int level=20;
		int puan = 1500;
		
		bonusHesapla(level,puan);
		

	}

	private static void bonusHesapla(int level, int puan) {
		// TODO Auto-generated method stub
		
	}

}
