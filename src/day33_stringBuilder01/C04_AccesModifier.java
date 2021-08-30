package day33_stringBuilder01;

public class C04_AccesModifier {

	public static void main(String[] args) {
		C03_AccesModifier obj1=new C03_AccesModifier();
		// C03 classından obje alamak için
		
		System.out.println(obj1.defaultAge);//15
		System.out.println(obj1.protectedAge);//32
		System.out.println(obj1.publicAge);//61
		
		C05_AccesModifier name=new C05_AccesModifier();
		System.out.println(name.protectedName);
		System.out.println(name.publicName);
		System.out.println(name.defaultName);
		

	}

}
