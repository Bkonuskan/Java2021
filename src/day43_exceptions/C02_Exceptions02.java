package day43_exceptions;


public class C02_Exceptions02 {
	
	public static void main(String[] args) {
		
		int [] arr= {34,35,41,63,21};
		
		try {
			System.out.println(arr[30]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("Hatalı index");
			
			
	 }
		finally {
			System.out.println("Dewamke okuduysan çalıştı");
			
		}
	}
	
	
	
	
	
	
	
}

	
