package day43_exceptions;

public class C03_Runner {

	 
		public static void main(String[] args) throws C03_InvalidEmailIdCheckedException { 
			
			mailDogrula("ab@gmaill.com"); 
		}
		public static void mailDogrula(String email) throws C03_InvalidEmailIdCheckedException { 
			
			if (email.contains("@hotmail.com") || email.contains("@gmail.com") ) {
				
				System.out.println(email); 
			} else {
				throw new C03_InvalidEmailIdCheckedException("Email adresi uygun degil"); 
		

	}//Süleyman Hocanın Parrent, Ata, hz.Adem videoları Türkçe olanları açtırabilir misiniz? Çeşitlilik adına

}}
