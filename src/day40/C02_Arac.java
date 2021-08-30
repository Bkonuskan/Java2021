package day40;

public class C02_Arac {

	 
		/* 1- Arac isimli bir superclass olusturunuz, fields : renk, motor(private), model(protected) olsun.
    	2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
     	3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuSayisi field ını ekleyiniz.
   		4- Bir AracPark isimli içinde main olan bir sınıf olusturunuz ve Otobus ten
           obj oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.
		 *   
		 */

		private String renk;
		private int motor;
		
		protected String model;

		public C02_Arac(String renk, int motor, String model) {
			
			setModel(model);
			setMotor(motor);
			setRenk(renk);
			 
			this.renk = renk;
			this.motor = motor;
			this.model = model;
			
			
		}

		public String getRenk() {
			return renk;
		}

		public void setRenk(String renk) {
			this.renk = renk;
		}

		public int getMotor() {
			return motor;
		}

		public void setMotor(int motor) {
			this.motor = motor;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}
		
		

}
