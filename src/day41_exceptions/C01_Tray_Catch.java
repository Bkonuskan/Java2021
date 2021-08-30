package day41_exceptions;

public class C01_Tray_Catch {
	
	
	public static void main(String[] args) {
		//2 tam sayının bölümünü yazdırınız.Agam bizimle eylenir
		
		int a=10; 
		int b= 0;
		 
			try { 
				System.out.println(a/b); 
			}
					catch (ArithmeticException e) { 
						System.out.println("Bolme isleminde payda sifir olamaz"); 
			}
	}

}
