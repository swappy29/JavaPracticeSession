package ArrayPractice;

public class array_simple_forloop {
    public static void main(String[] args) {
        // write your code here
        int values[] = new int[5];


        for (int i = 0; i < values.length; i++) {
            values[i] = i + 1;

            System.out.println(values[i]);
        }
    }
}
