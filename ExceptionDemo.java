import java.util.Scanner;
class ExceptionDemo{
    public static void main(String[] args) {
        try{
            int a,b;
            a=5;
            b = a / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.print("Divide by zero \n");
            System.out.println("Executed catch statement ");
        }
    }
}