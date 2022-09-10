package prex;

public class StringExamples {

	public static void main(String[] args) {
		
		String str="inderjeet Singh";
		
		System.out.println(str.length());
	    System.out.println(str.charAt(13));
	    System.out.println(str.substring(10));
	    System.out.println(str.substring(10,14));
	    String str1="Rajput";
	    String str2="rajput";
	    String str3="suchit"; 
	    String str4="suchit"; 
	    String output= str.concat(str1);
	    System.out.println(output);
	    System.out.println(str.indexOf("i"));
	    System.out.println(str.indexOf("e",5));
	    System.out.println(str.lastIndexOf("e"));
	    
//	    boolean out=str1.equals(str2);
	    System.out.println(str1.equals(str2));
	    System.out.println(str1.equalsIgnoreCase(str2));
	    System.out.println(str2.compareTo(str3));
	    System.out.println(str3.compareTo(str4));
	    String str5= str.replace("i","I");
	    System.out.println(str.replace("i","I"));
	    System.out.println(str5);
	    char ch= str.charAt(13);
	    System.out.println(ch);
	   
	
		
		

	}

}
