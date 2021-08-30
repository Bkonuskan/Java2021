package day35;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C06_Employees2 {
	/* TODO
    Burada iki adet class vardır. Biri Main diğeri ise Employees,
    Employees(Çalışanlar) class'ında;
    Bu variable'ları oluşturunuz;
    private String name,
    private int salary,
    private String dob (date of birth) (Doğum tarihi)
    getter ve setter oluşturunuz.
 Main class'ın içinde; kullanicidan name dob ve slary bilgilerini alip
    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.
  Örnek:
    Name is Fernando
    dob is 11/23/2000
    Salary is 80000
todo  ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
*/

	private String name;
	private int salary;
	private String dob;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int yasHesapla(String dob) {
        String strDate=dob;//"12/23/1999"
           
           LocalDate bugun=LocalDate.now();
           DateTimeFormatter format= DateTimeFormatter.ofPattern("MM/dd/yyyy");
           
           LocalDate dTarihi=LocalDate.parse(strDate,format);//kullaınıcın strig girdigi MM/dd/yyyy formata gore parcala 
           
           
           int age=bugun.getYear()-dTarihi.getYear();//bugun - kullanıcı dTarihi= yas
           
       return age;
   }
	
	
	
	
	
	
}
