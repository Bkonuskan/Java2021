package day34_encapsulation;

public class C03_ArabaMain {	 
		/*1- filedları model(String), renk(String), motor(int), yil (int)
    olan Araba  isimli bir class tanımlayınız.
 2- bütün fieldları parametre alan bir constructor tanımlayınız.
 3- bütün fieldları için getter ve setter metodları oluşturunuz.
 4- ArabaMain isminde main için bir class oluşturunuz.
 5- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
 6- aracların motor ve yılını hatalı veri girisine karsi kapsulleyiniz.
		 *  TODO Auto-generated method stub */
		String model;
		String renk;
		private int motor;//6.step
		private int yil;//6.step
		
		public C03_ArabaMain() {};
		
		public C03_ArabaMain(String model, String renk, int motor, int yil) {
			super();
			setModel(model);
			setRenk(renk);
			setMotor(motor);
			setYil(yil);
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
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
			if(motor>0) {
			this.motor = motor;
		}else this.motor=-motor;
		}

		public int getYil() {
			return yil;
		}

		public void setYil(int yil) {
			if(yil>0) {
				this.yil = yil;
		}else this.yil = -yil;
		}
				
		
		
}
	


