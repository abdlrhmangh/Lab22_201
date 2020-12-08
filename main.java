import java.util.Scanner;

public class lab22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = kb.next();
		System.out.println("Enter a character");
		char letter = kb.next().charAt(0);
		System.out.println();

		System.out.println();

		System.out.println("THE FIRST RECURSIVE METHOD OUTPUTS: " + count(word, letter));
		System.out.println("THE SECOND RECURSIVE METHOD OUTPUTS: " + count2(word, letter, 0));

	}

	public static int count(String str, char a) {

		if (str.length() == 0) {
			return 0;
		} else if (str.charAt(0) == a) {

			return 1 + count(str.substring(1), a);
		} else
			return +count(str.substring(1), a);
	}

	public static int count2(String str, char a, int i) {
		int index = str.length(), count = 0;
		String check, theLetter;
		theLetter = a + "";

		if (str.length() == i) {
			return 0;

		} else if (str.charAt(i) == a) {
			return 1 + count2(str, a, i + 1);

		} else
			return +count2(str, a, i + 1);

	}

}
