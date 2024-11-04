import java.io.*;
import java.util.Scanner ; 

class Rectangle{
    private double width, length , area ; 
    private String colour;
    Scanner input = new Scanner(System.in);

    void get_width() throws IOException{
        System.out.println("Enter the width:");
        width = input.nextDouble();
    }
    void get_length() throws IOException{
        System.out.println("Enter the length:");
        length = input.nextDouble();
    }
    void get_colour() throws IOException{
        System.out.println("Enter the colour:");
        colour = input.next();
    }

    double find_area(){
        area = length * width;
        return area;
    }
    String show_colour(){
        return colour;
    }
}
public class RectMatchDemo{
    public static void main(String[] args) throws IOException{
        Rectangle R1, R2;
        R1 = new Rectangle();
        R2 = new Rectangle();

        System.out.println("\n Enter data about first rectangle:");
        R1.get_length();
        R1.get_width();
        R1.get_colour();

        System.out.println("\n Enter data about second rectangle:");
        R2.get_length();
        R2.get_width();
        R2.get_colour();

        String c1 = R1.show_colour();
        String c2 = R2.show_colour();

        if((R1.find_area() == R2.find_area()) && (c1.compareTo(c2) == 0)){
            System.out.println("\n Matching Rectangles....");
        }
        else{
            System.out.println("\n Non-Matching Rectangles....");
        }
    }
}