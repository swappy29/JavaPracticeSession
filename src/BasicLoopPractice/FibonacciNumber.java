package BasicLoopPractice;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        // write your code here
        int k,a=1,b=2;
        Scanner sc=new Scanner(System.in);
        k=0;
        System.out.print("Enter Number:");
        int n=sc.nextInt();


        System.out.print("1 1 ");
        while(k<=n)
        {
            k=a+b;
            System.out.print(k+" ");
            a=b;
            b=k;

        }


    }
}
