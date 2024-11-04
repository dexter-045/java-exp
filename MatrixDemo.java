import java.io.*;
import java.util.Scanner ; 

class MatrixDemo{
    public static void main(String[] args){
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the order of matrix :");
        n = input.nextInt();
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];

        System.out.println("Enter Matrix a[][]");
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter Matrix b[][]");
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                b[i][j] = input.nextInt();
            }
        }

        System.out.println("Performing matrix addition....");
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                c[i][j] = a[i][j] + b[i][j] ;
            }
        }

        System.out.println("\nMatrix c[][]");
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                System.out.println( c[i][j]);
            }
            System.out.println("\n");
        }
    }
}