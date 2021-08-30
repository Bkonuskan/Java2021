package day44_AbstractClases04;

    /*
     *  1)  Abstract  bir insan class creat ediniz. 
     fields: 
 	 private String isim;
     private String soyisim;
     p'li constructor  creat ediniz
     abstract'li calis method creat ediniz
     concrete bilgilendirme method creat ediniz -->fields print etsin
     concrete isimDegistir method creat ediniz -->fields parametre 
     alsin atama yapsin

 2) Insan classina sub class olacak Calisan class creat ediniz  
    fields:
    private int calisanId;
    calisanId==0 ise calisan degil aksi durumda calýsan oldugunu kontrol edip id si ile yazdiriniz
    3 farkli obj ile ozelliklerini yazdiriniz
     */

    // Sorudaki istenenleri adim adim yapiyoruz...

    // 1. adimda class ismini abstract yaptik...
public abstract class Insan { 
	
	// 2. adimda variable lari oluturduk..
	private String isim;
	private String soyisim;

	// 3. adimda Parametreli constructor olusturduk... Source dan olustu...
	public Insan(String isim, String soyisim) {

		this.isim = isim;
		this.soyisim = soyisim;
	}

	// 4. adimda abstrack li calis methodu olusturduk...body si olmuyordu zaten...
	public abstract void calis();

	// 5. adimda Concrete bilgilendirme methodu creat ettik...
	public void bilgilendirme() {
    // 6. adimda yazdirmamizi istedi
		System.out.println("isim: " + this.isim + " soyisim: " + this.soyisim);
	}

	// 7. adimda ise concrete isimDegistir method creat ettik
	public void isimDegistir(String isim, String soyisim) {
		
	// 8. adimda atama yapmami istedi...
		this.isim = isim;
		this.soyisim = soyisim;
	}

}