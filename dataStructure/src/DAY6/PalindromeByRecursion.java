package DAY6;

import java.util.Scanner;

public class PalindromeByRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String p = sc.next();

		recursionMethod(p);

	}

	private static void recursionMethod(String p) {
		if (p.length() <= 1) {
			System.out.println("is a palindrome");
			return;
		}

		if (p.charAt(0) == p.charAt(p.length() - 1)) {
			recursionMethod(p.substring(1, p.length() - 1));
			return;
		}

		if (p.charAt(0) != p.charAt(p.length() - 1)) {
			System.out.println("not a palindrome");

		}

	}
}
