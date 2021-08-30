package day45_Interface01;

public class InterfaceRunner implements Interface02 {

	public static void main(String[] args) {
		
		// static olarak tanimlanmis variable ve method baska class dan classismi.metodismi ile cagirabiliriz..
		// hemen ornegi asagida yapildi...
		// implementten once olabilir...
		
		Interface02.deneme1(); // static calisti
		
		// default keywordu ile oluaturulan method obje uzerinden cagirilabilir...
		
		
		// implementten sonra yapilir...
		InterfaceRunner obj1= new InterfaceRunner();
		
		obj1.deneme(); // default calisti

	}

}
