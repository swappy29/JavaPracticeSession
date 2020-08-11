package ArrayPractice;

import java.util.Random;

public class two_dimensional_array {
    public static void main(String[] args) {
        // write your code here
        Random r = new Random();
        int a[] = {3, 4, 6, 7};
        int b[] = {13, 94, 76, 27};
        int c[] = {9, 3, 4, 8};
        int d[] = {33, 24, 56, 57};
        int p[][] = {
                {3, 4, 6, 7},
                {13, 94, 76, 27},
                {9, 3, 4, 8},
                {33, 24, 56, 57}

        };
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {


                System.out.print(p[i][j] + " ");
            }


            System.out.println(" ");

        }

    }
}
