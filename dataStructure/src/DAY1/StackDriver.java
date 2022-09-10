package DAY1;

public class StackDriver {
	public static void main(String[] args) {
		StackArray ss = new StackArray(5);
		try {
		

		ss.push('a');
		ss.push('b');
		ss.push('c');
		ss.push('d');
		ss.push('e');
		System.out.println(ss.pop());
		System.out.println("element entered");
		ss.push('f');
		System.out.println("element removed");
		System.out.println(ss.pop());
		System.out.println(ss.pop());
		System.out.println(ss.pop());
		System.out.println("element at top");
		System.out.println(ss.top());
		} catch (Exception e) {

			System.out.println(e.getMessage());

		}
	}
}
