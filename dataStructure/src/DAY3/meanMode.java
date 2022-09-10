package DAY3;

import java.util.Scanner;

public class meanMode {
	public static void main(String[] args) {
		int[] a;
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);

		int b = sc.nextInt();
		a = new int[b];

		System.out.println("enter the elements of array");

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		// for finding mean
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

		}
		int mean = sum / a.length;
		System.out.println("mean :" + mean);

		// for finding mode
		int count = 0;
		int g = 0;
		int mode = 0;

		for (int i = 0; i < a.length; i++) {
			if (mode == a[i])
				continue;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
				if (g < count) {
					g = count;
					mode = a[i];
				}
				count = 0;

			}

		}
		System.out.println("mode :" + mode);

	}

}
