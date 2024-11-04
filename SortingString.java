import java.util.Scanner;

public class SortingDemo1 {

	public static void main(String[] args) {
		
		int n, i, j;
		Scanner input = new Scanner(System.in);
		System.out.println("How many strings are to be sorted?");
		n = input.nextInt();
		String names[] = new String[n];
		System.out.println("Enter names...");
		for (i=0; i < n; i++) {
			
			names[i] = input.next();
		} 
	     	for (i=0; i< (n-1); i++) {
	    	 	for (j=0; j < (n - i -1); j++) {
	    		 	if (names[j].trim().compareTo(names[j+1].trim()) > 0) { 
	    			 	String temp = names[j]; 
	    			 	names[j]= names[j + 1]; 
	    			 	names[j + 1] = temp;
	    		 	}
	    	 	}

		}

		System.out.println("Sorted list of names...");

		for (i=0; i < n; i++) {

		    System.out.println("  " + names[i]);
		}
	}
}
