package day06_relationalOperators_ifstatement;

public class C2_IfStatements01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 3;
		int b = 5;

		if (a > b) {
			System.out.println(a + b);

		}
		if (a == b) {
			System.out.println(a * b);

		}
		if (a < b) {
			System.out.println(a * b);

			if (a > b || a + b < 10) {
				System.out.println("Yaşasın Java");
			}
		}
	}
}
