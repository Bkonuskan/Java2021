package day42_exceptions;

import java.util.Scanner;

public class C07_Exceptions10 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Sayi Giriniz");
		int age=scan.nextInt();
		
		//1.yol try-cacth kullanmadan
		/*if(age>=0) {
			System.out.println("Yaşınız : "+ age);
		}else {
			
			throw new IllegalArgumentException();
			
		}*/
		
		try {
            if (age>=0) {
                System.out.println("yasiniz :"+age);
                
            } else {
                throw new IllegalArgumentException();
            }
            
        } catch (IllegalArgumentException e) {
            
                e.printStackTrace();
                
            
        }
        System.out.println();
        System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");
	}

}
