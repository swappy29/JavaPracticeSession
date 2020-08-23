package oops_concepts;

public class inheritance {
    public static void main(String[] args) {
        // write your code here

        Mul a1=new Mul();
        a1.a=100;
        a1.b=10;
        a1.sum();
        System.out.println(a1.c);
        a1.subtraction();
        System.out.println(a1.c);
        a1.multiplication();
        System.out.println(a1.c);

    }

}
class Add {
    int a,b,c=0;
    public void sum()
    {
        c=a+b;
    }

}
class Sub extends Add {

    public void subtraction()
    {
        c=a-b;                     // singlelevel inheritance
    }

}
class Mul extends Sub {

    public void multiplication()
    {
        c=a*b;                        // multilevel inheritance
    }

}


