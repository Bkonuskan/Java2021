package day34_encapsulation;

public class C02_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C01_Encapsulation insan=new C01_Encapsulation();
		
		//insan.age=-47;
		insan.name="Basri";
		insan.surname="Konuskan";
		insan.setAge(-41);
		System.out.println(insan.name);
		System.out.println(insan.surname);
		System.out.println(insan.getAge());
		
		
	}

}
