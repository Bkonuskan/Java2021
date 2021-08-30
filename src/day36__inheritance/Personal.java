package day36__inheritance;

public class Personal {
	public static int sayac=1000;
	public int id;
	public String isim;
	public String soyisim; 
	public String adres;
	public String tel;

	public int idAta() {
		this.id=sayac++;
		return id;
		
		
	}
}
