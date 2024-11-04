import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i ,j,flag;
		int N =50;
		System.out.println("Prime number between 1 and " + N +" are:");
		for(i = 1; i <= N; i++) {
			if(i == 1 || i == 0)
				continue;
			flag = 1;
			for( j =2; j <= i/2; ++j) {
				if(i % j == 0) {
					flag =0;
					break;
				}
			}
			if (flag == 1)
				System.out.print(i + "  ");
	

		}
	}
}