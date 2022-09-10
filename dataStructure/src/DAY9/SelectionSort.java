package DAY9;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = new int[] { 45, 0, 78, 10, 75, 24 };
		sorting(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void sorting(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) 
				if (arr[j] < arr[min]) 
					min = j;
				
					int temp = arr[min];
					arr[min] = arr[i];
					arr[i] = temp;
				
			
		}
		
	}

}
