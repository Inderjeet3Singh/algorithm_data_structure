package DAY3;

import java.util.Arrays;
import java.util.Scanner;

public class sortingOfArray {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of array");
		int [] b= new int[sc.nextInt()];
		
		System.out.println("enter element of array");
		
		for(int i=0; i<b.length; i++) {
			b[i]= sc.nextInt();
		}
		
		int[] c= new int[b.length];
		int k=0;
		int temp;
		int z=0;
		while(k <b.length) {
		for(int i=k+1; i<b.length; i++) {
		if(b[k]<b[i]) {
			temp=b[i];
			b[i]=b[k];
			b[k]=temp;
			
			
		}
		}
		    c[z]=b[k];
		    z++;
		
		k++;
	}
		System.out.println(Arrays.toString(c));
	}
	
	
}
