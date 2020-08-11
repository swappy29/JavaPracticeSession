package ArrayPractice;

import java.util.Random;

public class array_random_class {
    public static void main(String[] args) {
        // write your code here
        Random r=new Random();
        int values[] = new int [50];


        for(int i=0;i< values.length;i++) {
            values[i] = r.nextInt(400);

            System.out.println(values[i]);
        }

    }
}
