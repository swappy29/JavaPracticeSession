package ArrayPractice;

public class forloop_three_dimensional_array {
    public static void main(String[] args) {

        // write your code here
        int a[][][]=new int [4][4][4];
        for(int i=0;i<4;i++)
        {
            for(int J=0;J<4;J++)
            {
                for(int k=0;k<4;k++)
                {
                    a[i][J][k]= i+J+k;
                }
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int J=0;J<4;J++)
            {
                for(int k=0;k<4;k++)
                {
                    System.out.print(" "+a[i][J][k]);
                }
            }
        }


    }
}
