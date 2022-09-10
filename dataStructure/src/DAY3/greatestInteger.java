package DAY3;

public class greatestInteger {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 5;
		
		System.out.println("a :" + a + "\n" +"b :" + b + "\n" + "c :" + c  );

//		if (a >= b && a >= c) {
//			System.out.println("a is greatest of three: " + a);
//		} else if (b >= c && b >= a) {
//			System.out.println("b is greatest of three: " + b);
//		} else
//			System.out.println("c is greatest of three: " + c);
		
		String s= "greatest of three :";
		
		
		if (a>b) {
			if (a>c) {
				System.out.println(s+ a);
			}else {
				System.out.println(s+ c);
		    }
		}else {
			if (b > c) {
				System.out.println(s + b);
			}else {
				System.out.println(s +c);
			}
		}

	}

}
