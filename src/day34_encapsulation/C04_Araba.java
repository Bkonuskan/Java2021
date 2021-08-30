package day34_encapsulation;

public class C04_Araba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C03_ArabaMain volvo=new C03_ArabaMain("xc90", "beyaz", 2400, 2020);
		C03_ArabaMain audi=new C03_ArabaMain("Q7", "bej", 3000, 2021);
		C03_ArabaMain honda=new C03_ArabaMain();
		
		honda.model="civic";
		honda.renk="gri";
		honda.setYil(1999);
		honda.setMotor(1400);
		System.out.println("honda yıl : "+ honda.getYil());
		System.out.println("honda yıl : "+ honda.getMotor());
		
		System.out.println("volvo yıl : "+ volvo.getMotor());
	}

}
