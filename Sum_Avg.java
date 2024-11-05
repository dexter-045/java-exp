import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the number of values:");
        int count = input.nextInt();

        
        double sum = 0;

        
        System.out.println("Enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            double number = input.nextDouble();
            sum += number;  // Add each number to sum
        }

        
        double average = sum / count;

       
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);
    }
}
