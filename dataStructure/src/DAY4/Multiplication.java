package DAY4;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number you want to get table of");
		int i = sc.nextInt();

		System.out.println("enter the number you want to get table upto");
		int x = sc.nextInt();

		multiTable(i, x);

	}

	private static int multiTable(int i, int x) {

		if (x == 1) {

			System.out.println(i + " x " + x + " = " + i);

			return i;
		} else {

			int p = i + multiTable(i, x - 1);

			System.out.println(i + " x " + x + " = " + p);

			return p;
		}

	}

}
