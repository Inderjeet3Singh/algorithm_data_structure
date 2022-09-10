package DAY8;

import java.util.Scanner;

public class HateZeroes {
	static int tempcol;
	static int temprow;
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int m = sc.nextInt();
//		int n = sc.nextInt();
		int[][] arr = { { 1, 2, 3, 4 },
						
						{ 0, 0, 0, 0 },
						{ 9, 6, 5, 4 },
						{ 0, 0, 0, 5 } };


//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr.length; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}

		hateZeroes(arr);
		changerow(arr, tempcol);
		changecol(arr, temprow);
		
		
		p(arr);
	}

	private static void changerow(int[][] arr, int c) {
	
		
		for(int i=0; i<arr.length; i++) {
			for(int j=c; j<arr[i].length-1; j++) {
				int tmp=arr[i][j];	
				arr[i][j]= arr[i][j+1];
				arr[i][j+1]=tmp;
				
			}
		}
		
	}
private static void changecol(int[][] arr, int d) {
	
		
		for(int i=d; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length; j++) {
				int tmp=arr[i][j];	
				arr[i][j]= arr[i+1][j];
				arr[i+1][j]=tmp;
			}
		}
		
	}
	static void p(int[][] arr) {

		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]!=0) {
				System.out.print(" "+arr[i][j] + " ");	
				}
			}
			System.out.println();
		}
	}
//
	private static void hateZeroes(int[][] arr) {

		// for identifying the column of zero
		int countcol=1;
		for (int j = 0; j < arr.length; j++) {

			if (arr[0][j] == 0) {
				for (int i = 1; i < arr.length; i++) {
					if (arr[i][j] == 0) {
						countcol++;
						if (countcol==arr.length) {
							 tempcol=j;
							
						}

					}
				}

			}
		}
		
		// for identifying the row of zero
		int countrow=1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]==0) {
				for(int j=1;j<arr.length;j++) {
					if(arr[i][j]==0) {
						countrow++;
						if(countrow==arr.length) {
							temprow=i;
							
						}
					}
				}
			}
		}
		
	
		

	}
	
	

}
