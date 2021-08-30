package day38_inheritance._12_Inheritance_04;

public class Mammal extends Animal{
	
	public void mA() {
		System.out.println("Mammel");
	}
	
	public void mC() {
		System.out.println("Cat"+ "Mamal");
		
	}
	public int c=7;
	public int m=4;
	
	public Mammal() {
		this('B');
	System.out.println("Parametresiz mammal cons");
	
}

    public Mammal (char c) {
    	super(5);//parantten P2li cons. çağırdık
	System.out.println("Char Parametreli construkter");
	
	
}
	
		
}
