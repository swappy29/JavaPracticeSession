package BasicLoopPractice;

public class PerfectNumber {

    public static void main(String args[])
    {
        int n=6;
        boolean b= isPerfect(n);
        if(b)
        {
            System.out.println(n+"is a perfect number");
        }
        {
            System.out.println(n+"is not  a perfect number");
        }
    }
    public static  boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=0;i<=n;i++)
        {


            if(n%i==0)
            {
                sum=sum+i;

            }
        }
        if(n==sum)
        {
            return  true;
        }
        return false;
    }
}
