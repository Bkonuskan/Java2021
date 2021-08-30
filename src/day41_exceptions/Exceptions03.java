package day41_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream file =new FileInputStream("C:\\Users\\Ern\\eclipse-workspace\\java2021SummerTr\\src\\day41_exceptions\\Untitled 2");
		
		int i=0;
		try {
			while ((i=file.read())!=-1) {//int değeri file obj ead metodu ile atandığında -1 e eşit değilse whiele gir
				
				System.out.print((char)(i));
			}
				
			
			
		} catch (IOException e) {
			e.printStackTrace();//Hatanın tüm verisini verir en çok bu kullanılır
			System.out.println(e.getMessage());
		}
			 
		}
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
          System.out.println();
		System.out.println("Dewamke Keko");
	}

}
