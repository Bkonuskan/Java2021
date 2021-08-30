package day34_encapsulation;

public class C01_Encapsulation {

		String name;
		String surname;
		private int age;
		
	public static void main(String[] args) {
	
   /*
	public void yasAta(int age) {
		if (age<0) {
			this.age=-age;
		}else this.age=age;
	 
 }
	public int yasGoster(int age) {
	return this.age;
	 */
 }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0) {
		this.age = age;
	}else this.age=-age;
	}	
}
