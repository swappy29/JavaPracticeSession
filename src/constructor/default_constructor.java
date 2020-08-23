package constructor;

public class default_constructor {

    public static void main(String[] args) {
        // write your code here
        parameterized_constructor obj=new parameterized_constructor(5,6.78);

    }

}
class parameterized_constructor
{


    public parameterized_constructor( )
    {
        System.out.println("hello");
    }
    public parameterized_constructor(int a )
    {
        System.out.println("hi");
    }
    public parameterized_constructor(int a, double j )
    {
        System.out.println("hey");
    }


}


