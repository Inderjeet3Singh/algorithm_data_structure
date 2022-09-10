package prex;

import java.util.Scanner;

public class PLL {



	public static String StringChallenge(String n) {
		int num = Integer.parseInt(n);
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count = count + 1;
			}

		}
		return count + "";

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(StringChallenge(s.nextLine()));

	}
}