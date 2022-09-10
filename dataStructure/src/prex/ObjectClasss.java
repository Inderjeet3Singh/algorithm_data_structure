package prex;

public class ObjectClasss {
	void display(){
		System.out.println("form ObjectClasss");
		
	}

}

class Box extends ObjectClasss{
	String shape;
    String color;
    
    public Box(String shape, String color) {
	
		this.shape = shape;
		this.color = color;
	}

	
	
	
//   void display() {
//	   System.out.println("shape ="+ shape +", color = " + color);
//   }
	
}


class MainDriverr{ 
	public static void main(String[] args) {
		Box box = new Box("circle", "white");
		
		box.display();
		
	}
}