package prex;

public class ClassObjectPrectice {

	private int top;
	Animal[] stack;

	public ClassObjectPrectice(int size) {
		stack = new Animal[size];
		top = -1;
	}
	
	public  boolean isFull() {
		return(top>=stack.length-1);
	}
	

	public  boolean isEmpty() {
		return top==-1;
	}
	public void push(Animal data) throws Exception{
		if (!isFull()) {
			top = top + 1;
			stack[top] = data;
		} else throw new Exception("Stack is full");
	}
	

	public Animal pop() throws Exception{
		if(! isEmpty()) {
			
			return stack[top--];
			
		} else throw new Exception("Stack is empty");
		
	}
	public Animal top() throws Exception{
		if (!isEmpty()) {
			
		
			return stack[top];
			
		} else throw new Exception("Stack is empty");

	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ClassObjectPrectice cop = new ClassObjectPrectice(4);

		//Animal[] arr = cop.animalStack;
		
		cop.push(new Animal("Dog", "Black"));
		cop.push(new Animal("Cat", "White"));
		cop.push(new Animal("Rat", "Brown"));
		
		System.out.println("Top animal");
		Animal obj=cop.pop();
		System.out.println(obj);
		
		System.out.println("Popped animals");
		System.out.println(cop.pop());
		System.out.println(cop.pop());
		
		System.out.println("Top animal");
		System.out.println(cop.top().display());
		
		System.out.println("Add  new Member");
		cop.push(new Animal("Rabbit", "White"));
		
		System.out.println("Top animal");
		System.out.println(cop.top().display());

	}

}

class Animal {

	private String color;
	private String name;
	public Animal(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animal [color=" + color + ", name=" + name + "]";
	}
	
	public String display() {
		return "Animal [color=" + color + ", name=" + name + "]";
	}
	
	
}