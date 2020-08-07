package BasicLoopPractice;

import java.util.Scanner;

public class ArmstrongNumber {


    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        n=sc.nextInt();
        int result=n;
        int r,sum = 0;
        while(n>0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        if(result==sum)
        {
            System.out.print("is armstrong number");
        }else{
            System.out.println("is not armstrong number");
        }

        // write your code here
    }

}
