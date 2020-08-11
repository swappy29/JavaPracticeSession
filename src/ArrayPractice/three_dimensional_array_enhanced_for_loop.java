package ArrayPractice;

public class three_dimensional_array_enhanced_for_loop {
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
        for(int i[][]:a)
        {
            for(int J[]:i)
            {
                for(int k:J)
                {
                    System.out.print(" "+k);
                }
            }
        }


    }
}
