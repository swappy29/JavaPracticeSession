package oops_concepts;

public class constructor_inheritance {
    public static void main(String[] args) {
        // write your code here

        Sub1 a1=new Sub1(4);//Add a1=new Sub(4); we can create reference of main class and object of subclass


    }

}
    class Add1 {

    public  Add1()
    {
        System.out.println("Add");
    }
    public  Add1(int i)
    {
        System.out.println("Addition");
    }

}
class Sub1 extends Add1 {

    public  Sub1()
    {
        System.out.println("Sub");
    }
    public  Sub1(int i)
    {
        System.out.println("Subtraction");
    }

}


