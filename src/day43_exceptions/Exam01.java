package day43_exceptions;

public class Exam01 {

			/*
		'ortalama' isminde bir method oluşturun ve int v  - int f  isminde 2 adet parametresi olsun.
		int v = vize
		int f = final
		Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
		Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
		Diğer durumlarda ise,
		vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
		vizeye 120, finale 80 girin.
		Programın çalışmasını sağlayın. (handle edin)
		 */
	
	
	
	
	
	
	
	public static void main(String[] args) {
		try {
			ortalama(100,100);
			
		} catch (Exception e) {
			 System.out.println(e);
		}
				

	}
	public static void ortalama(int v,int f) {
		if (v>100 || v<0||f>100||f<0) {
			throw new ArithmeticException("Notlar 0-100 arasında olmalı");
			
		}else {
			System.out.println("Ortalama : "+ ((v*0.4)+(f*0.6)));
		}
	}
}
