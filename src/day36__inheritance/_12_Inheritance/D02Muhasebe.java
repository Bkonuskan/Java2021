package day36__inheritance._12_Inheritance;

public class D02Muhasebe extends D01Personel {
	
	public String statu;
	
	public int  saatUcreti;
	
	public int maas;
	
	public int maasHesapla() {
		maas=saatUcreti*8*30;
		
		return maas;
		
	}

}
