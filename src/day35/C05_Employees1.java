package day35;

import java.util.Scanner;

public class C05_Employees1 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Adinizi giriniz : ");       
	        String name =scan.nextLine();
	        
	        System.out.print("Doğum tarihinizi giriniz :  ");      
	        String dob =scan.nextLine();
	        
	        System.out.print("Talep ettiğiniz maaşı3e  giriniz (true/false) : ");      
	        int salary =scan.nextInt();
	        C06_Employees2 calisan =new  C06_Employees2();
	        
	        calisan.setDob(dob);
	        calisan.setName(name);
	        calisan.setSalary(salary);
	        int calisanYas=calisan.yasHesapla(dob);
	        
	        
	        if (calisanYas>18) {
	            
	            System.out.println("Welcome to our company "+name+" your salary is: "+salary);
	        }else if (calisanYas<18) {
	            
	            System.out.println("come back when you are 18 years old.");
	        }else if (calisanYas==18) {
	            System.out.println("we can have inter with you after that you can have a "+salary+" salary");
	        }

	}

}
