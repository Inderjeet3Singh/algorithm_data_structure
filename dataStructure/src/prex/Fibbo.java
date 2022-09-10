package prex;

import java.util.Scanner;

public class Fibbo {
	
	 public static String MathChallenge(String n) {
		 int num = Integer.parseInt(n);
		 
		 if(num ==0  || num ==1) return "yes";
		 
		 int n1=0,n2=1,n3; 
		   
		    
		 for(;;)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  if(n3==num) return "yes"; 
		  
		  if(n3>num) return "NO";
		  n1=n2;    
		  n2=n3;    
		 }  
    	 //code here
 	

 	}
	
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println(MathChallenge(s.nextLine()));
}

}
