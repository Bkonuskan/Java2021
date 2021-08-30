package day43_exceptions;
 

	 
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		public class C01_Exceptions01 {
		    
			public static void main(String[] args) throws IOException {
		     
				FileInputStream fis = new FileInputStream(
		        		"C:\\Users\\Ern\\eclipse-workspace\\java2021SummerTr\\src\\day41_exceptions\\Untitled 2");
		        int i = 0;
		        while ((i = fis.read()) != -1) {
		            System.out.print((char) (i));
		        }
		/*
		 * thorws keyword'u sadece declaration'dir. 
		 * Throws kullanilan methodda exception olusursa CODE BLOCK olur.
		 * Exceptions arasinda pranet-child iliskisi varsa parent class exception throws'dan sonra yazilmali
		 */
		    }
		}