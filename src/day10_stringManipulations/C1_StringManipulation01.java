package day10_stringManipulations;

public class C1_StringManipulation01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1="Ali Can";
		String name2="Ali Can";
		String name3= name2+ "";
		String name4="Ali";
		String name5="Can";
		String name6=name4 + " " + name5;
		
		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));
		System.out.println(name1.equals(name6));
		
		
		System.out.println(name1==name2);
		System.out.println(name1==name3);
		System.out.println(name1==name2);
		
		String name7="ALI CAN";
		String name8="ALI cAN";
		String name9="ali can";	
		
		System.out.println(name1.equals(name7));
		System.out.println(name1.equalsIgnoreCase(name7));
		
		System.out.println(name7.equalsIgnoreCase(name9));
		System.out.println(name8.equalsIgnoreCase(name9));
		
		
	}

}
