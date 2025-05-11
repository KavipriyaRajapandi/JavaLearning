import java.util.Scanner;

public class CaseConversionSimple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		String ans = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isUpperCase(c)) {
				ans += Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				ans += Character.toUpperCase(c);
			} else {
				ans += c;
			}
		}

		System.out.println("Original String: " + input);
		System.out.println("Converted String: " + ans);
	}
}
