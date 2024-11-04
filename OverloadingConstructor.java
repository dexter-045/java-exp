import java.util.Scanner;
public class OverloadingDemoo{
    double num1, num2;

    OverloadingDemoo(){
        num1 = 0;
        num2 = 0;
    }

    OverloadingDemoo(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    OverloadingDemoo(double num1,double num2, double num3){
        this.num1 = num1;
        this.num2 = num2 + num3;
    }

    public void Sum(){
        double ans;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        ans = num1 + num2;
        System.out.println("Sum = " + ans);
        System.out.println();
    }
    public static void main(String[] args){
        OverloadingDemoo obj1 = new OverloadingDemoo();
        OverloadingDemoo obj2 = new OverloadingDemoo(10, 20);
        OverloadingDemoo obj3 = new OverloadingDemoo(10, 20,  30);
        obj1.Sum();
        obj2.Sum();
        obj3.Sum();
    }

    
    
}

