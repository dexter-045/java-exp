import java.util.Scanner;

class SortingDemo {
    public static void main(String[] args) {
      int n, i, j, temp;
      Scanner input = new Scanner(System.in);
      System.out.println("How many numbers are to be sorted?");
      n  = input.nextInt();
      int array[]= new int[n];
      System.out.println("Enter integers...");
      for (i = 0; i < n; i++) { 
	      array[i] = input.nextInt(); 
	}

    for (i = 0; i < (n-1); i++) {
    	for (j=0; j< (n -1 -1); j++) {
            if (array[j] > array[j+1]) { 

               temp = array[j];
               array[j] = array[j + 1];
               array[j+1]= temp;
                 
            }
    	}
    }
    System.out.println("Sorted list of integers...");
    for (i = 0; i < n; i++) { 
    	System.out.print("  "  + array[i]); 
    	}
    }
}
