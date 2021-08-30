package day40;

public class C02_Otobus extends C02_Arac {
	int yolcuSayisi;

	public C02_Otobus(String renk, int motor, String model, int yolcuSayisi) {
		super(renk, motor, model);
		this.yolcuSayisi = yolcuSayisi;
	}

	@Override
	public String toString() {
		return "\nYolcuSayisi= " + yolcuSayisi +"\nModel=" + model +"\nRenk=" + getRenk()
				+"\nMotor =" + getMotor() + "\ntoString()=" + super.toString() + "]";
	}
	

	 

	

}
