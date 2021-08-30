package day40;


class Derived { public void getDetails() {
	System.out.println("Derived class"); 
} } 
public class C01_Overriding extends Derived {
public void getDetails() { 
	System.out.println("Test class"); 
} 
public static void main(String[] args) {
	Derived obj = new C01_Overriding(); 
	obj.getDetails(); 
} } 

 