package DAY4;

import java.util.Scanner;

public class fact {
	public static void main(String[] args) {
		System.out.println("enter the number to get factorial ");
		Scanner sc = new Scanner(System.in);

		System.out.println(factorial(sc.nextInt()));
	}

	private static int factorial(int i) {
		if (i == 1) {
			return 1;
		} else {
			return i * factorial(i - 1);
		}

	}

}
