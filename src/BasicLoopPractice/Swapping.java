package BasicLoopPractice;

import java.util.Scanner;

public class Swapping {



    public static void main(String[] args) {
        // write your code here
        int a,b,c;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Value of a");
        a=sc.nextInt();
        Scanner sc1 =new Scanner(System.in);
        System.out.println("Enter Value of b");
        b=sc.nextInt();
        //a=3,b=4;
        // a=a+b;//3+4=7
        // b=a-b;//7-4=3
        //a=a-b;//7-3=4
        //c=a;
        //a=b;
        //b=c;

        b=a+b-(a=b);



        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
