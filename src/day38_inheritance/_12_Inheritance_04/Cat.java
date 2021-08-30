package day38_inheritance._12_Inheritance_04;

public class Cat extends Mammal{
	
	public void mC(){
		System.out.println("Cat Cat Cat");
		
	}
	public int c=9;//parenti ile aynı
	public int d=5;
	
	public Cat() {
		System.out.println("Parametresiz cons");
	}
	
	public Cat (String s) {
		this();
		System.out.println(super.c);
		System.out.println("Parametreli construkter");
		
	}
		
}
	
		