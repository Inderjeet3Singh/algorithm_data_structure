package prex;

import java.util.Arrays;

public class ZeroAtEnd {
	public static void main(String[] args) {
		int[][] arr = new int[][] { { 4, 5, 0, 6, 8, 9 }, 
			{ 5, 6, 0, 8, 3, 7 },{ 4, 5, 0, 6, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0) {
					for (int k = i+1; k < arr.length; k++) {
						for (int l = j+1; l < arr.length; l++) {
				 int temp=arr[i][j];
				 arr[i][j]=arr[k][l];
				 arr[k][l]=temp;
						}}
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println("");
			}
	}

}
