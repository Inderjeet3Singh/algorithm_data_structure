package DAY9;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= new int[] {45,23,78,10,75,24};
		
		sorting(arr);
	}

	private static void sorting(int[] arr) {
		for(int n=0;n<arr.length;n++) {
			for(int m=1;m<arr.length;m++) {
				if(arr[m-1]>arr[m]) {
					int temp=arr[m-1];
					arr[m-1]= arr[m];
					arr[m]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
