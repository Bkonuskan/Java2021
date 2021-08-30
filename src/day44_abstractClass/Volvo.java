package day44_abstractClass;

public abstract class Volvo {// abstract class

	public abstract void kapi();// abs method

	public abstract void motor();
	
	public static void main(String[] args) {
		Volvo volvo=new Volvo() {

			@Override
			public void kapi() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void motor() {
				// TODO Auto-generated method stub
				
			}
			
			
		};	
		
	}

	public void klima() {
		System.out.println("Klima motor gücünü azaltır");
		
		

	}

}
