package ArrayPractice;

import java.util.Random;

public class jagged_array {
    public static void main(String[] args) {
        // write your code here
        Random r = new Random();
        int a[] = {3, 4};
        int b[] = {13, 94, 76};
        int c[] = {9, 3};
        int d[] = {33, 24, 56, 57};
        int p[][] = {
                {3, 4},
                {13, 94, 76},
                {9, 3},
                {33, 24, 56, 57}

        };
        for (int i[]:p) {
            for (int j :i) {


                System.out.print(j + " ");
            }


            System.out.println(" ");

        }

    }
}
