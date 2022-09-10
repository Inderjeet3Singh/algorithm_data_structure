package DAY4;

import java.util.Scanner;

public class WordCrossing {
	// coordinate of common character
	static int ccRi; // row index
	static int ccCi; // column index
	static String cc;
	static char z;

	public static void main(String[] args) {

		System.out.println("enter the starting coordinates of vertical string ( in row and column)");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();

		System.out.println("enter the word you want to insert vertically");
		String vS = sc.next();

		System.out.println("enter the word you want to insert horizontally");
		String hS = sc.next();

		commonCharacter(vS, hS);

		String[][] arr = new String[10][10];

		// inserting column string
		int k = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {

				if (j == c) {
					if (i >= r && i < vS.length() + r) {
						arr[i][j] = " " + vS.charAt(k);
						k++;
					} else {
						arr[i][j] = " *";

					}

				} else {

					arr[i][j] = " *";
				}

			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j].equals(cc)) {
					ccRi = i;
					ccCi = j;

				}

			}

		}

		// inserting row string

		int m = 0;
		int diff = ccCi - hS.indexOf(z);
		for (int j = diff; j < diff + hS.length(); j++) {

			arr[ccRi][j] = " " + hS.charAt(m);
			m++;

		}

		printMatrix(arr);

	}

	private static void printMatrix(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]);

			}
			System.out.println("");
		}

	}

	private static void commonCharacter(String vS, String hS) {

		for (int i = 0; i < vS.length(); i++) {
			for (int j = 0; j < hS.length(); j++) {
				if (vS.charAt(i) == hS.charAt(j)) {
					cc = " " + vS.charAt(i);
					z = hS.charAt(j);

					return;

				}

			}
		}

	}
}
