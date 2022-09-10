package prex;
import java.util.*;

public class Newex {
	
	public static void main(String[] args) {
		int [] arr= new int[] {45,23,78,10,75,24};
		sorting(arr);
	}

	private static void sorting(int[] arr) {
		int j;
		for(int i=0;i<arr.length;i++) {
			int temp= arr[i];
			for(j=i;(j>0 && arr[j-1]>temp);j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
		
	}

	

}
