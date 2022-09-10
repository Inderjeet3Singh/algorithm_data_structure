package DAY4;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc = new Scanner(System.in);
		String sb = sc.next();
//		char[] c = new char[sb.length()];
//		
//		int k=0;
//		
//		for(int i=sb.length()-1;i>=0;i--) {
//		 c[k++]= sb.charAt(i);
//			
//		}
//		 
//		String bs= new String(c);
//		
//		if (sb.equals(bs)) {
//			System.out.println("is a palindrome");
//		}else {
//			System.out.println("not a palindrome");
//		}

		int i, j, f = 0;
		for (i = 0, j = sb.length() - 1; i < sb.length() / 2; i++, j--) {
			if (sb.charAt(i) != sb.charAt(j)) {
				f = 1;
				System.out.println("not a palindrome");
				break;
			}
		}
		if (f == 0)
			System.out.println("palindrome");
	}

}
