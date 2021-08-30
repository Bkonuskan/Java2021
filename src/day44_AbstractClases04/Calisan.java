package day44_AbstractClases04;

public class Calisan extends Insan {
	
	// Sorunun 2. kismini kopyalayip devam edelim...
	/*
	Insan classina sub class olacak Calisan class creat ediniz  
    fields:
    private int calisanId;
    calisanId==0 ise calisan degil aksi durumda calýsan oldugunu kontrol edip id si ile yazdiriniz
    3 farkli obj ile ozelliklerini yazdiriniz
	*/
	
	// 1. adimda private int calisanId; olusturduk...
	private int calisanId;
	

	// 2. adimda parametreli constructor olusturduk...
	public Calisan(String isim, String soyisim,int calisanId) {
		super(isim, soyisim);
		this.calisanId=calisanId;
	}

	// 3. adim
	@Override
	public void calis() {
	
	// 4. adim
		if (calisanId==0) {
			System.out.println("bu sahis sirket calisani degil");
			System.out.println("sahsin id'si : "+calisanId);
			
		}else {
			System.out.println("bu sahis bizim gundiii :)");
			System.out.println("sahsin id'si : "+calisanId);
		}

	} 
	
	// 5. adimda 3 adet parametreli obje olusturuyoruz bunun icin main gerekir...
	public static void main(String[] args) {
		 
		Calisan ITManager= new Calisan("Merve","Aslan", 0);
		Calisan QAtester= new Calisan("Omer","Faruk", 1453);
		Calisan Developer= new Calisan("Oguzhan ","Akkafa", 1905);
		
		ITManager.bilgilendirme();
		ITManager.calis();
		
		
		QAtester.bilgilendirme();
		QAtester.calis();
		
		Developer.bilgilendirme();
		Developer.calis();
		
		
	}

}