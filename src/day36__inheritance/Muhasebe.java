package day36__inheritance;

import day36__inheritance._12_Inheritance.D01Personel;

public class Muhasebe{
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		maas=saatUcreti*8*30;
		return maas;
	}
	

}
