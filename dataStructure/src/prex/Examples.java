package prex;

public class Examples {
	
	    public static void main(String[] args) {
	        int[][] values = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
	         
	        System.out.println("Elements are :");
	        for(int i=0; i< values.length; i++) {
	            for(int j=0; j< values.length; j++) {
	                System.out.print(values[i][j] + " ");
	            }
	            System.out.println("");
	        }
	    }
	

}
