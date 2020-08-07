package BasicLoopPractice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        num = sc.nextInt();
        boolean isprime = true;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            System.out.println(num + "is a prime number");
        } else {


            System.out.println(num + "is not a prime number");
        }
    }

}
