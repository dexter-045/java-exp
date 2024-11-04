import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int a,b,c;
		int fact =1;
		int choice;
		char ans;
		System.out.println(" \nProgram for Calculator");
		System.out.println(" \nEnter the first number");
		a = input.nextInt();
		System.out.println(" \nEnter the second number");
		b = input.nextInt();
		do {
			System.out.println("\n\tMain Menu");

			System.out.println("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Factorial");
			System.out.println("\nEnter your choice");
			choice= input.nextInt();

			switch (choice) {

				case 1:
	
					c = a + b;
		
					System.out.println("\nThe Addition is " + c);
					break;
	
				case 2:
	
					c = a - b;
					System.out.println("\n The Subtraction is" + c);
					break;
	
				case 3:
	
					c = a * b;
		
					System.out.println("\n the Multiplication is" + c);
					break;
	
				case 4:
		
					if (b != 0) {
		
						c = a / b;
			
						System.out.println("\n The Division is " + c);
		
					} else {
		
						System.out.println("\n Cannot divide by zero");
					}
		
					break;
	
				case 5:
	
					System.out.println("\n Enter the number for computing factorial: ");
		
					int num = input.nextInt(); 
					fact =1;
					for (int i = 1; i <= num; i++) {
		
						fact  = fact * i;
					}
					System.out.println("Factorial) of given sumber is: " + fact);
	
					break;

				default:
	
					System.out.println("\n  Invalid choice");
			}
	
			System.out.println("\n  Do you want to continue? (y/n)");
			ans = input.next().charAt(0);
		} while (ans == 'y');
}
}