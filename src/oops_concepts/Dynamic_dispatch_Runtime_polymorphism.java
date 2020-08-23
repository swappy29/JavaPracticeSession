package oops_concepts;

public class Dynamic_dispatch_Runtime_polymorphism {
    public static void main(String[] args) {
        // write your code here
        // E a1=new E();
        E a1=new E();
        F a2=new F();
        E e;
        e=a2;
        a1.display();



    }

}
class E {

    public void display()
    {
        System.out.println("parent class");
    }


}
class F extends  E{
    public void display()
    {
        System.out.println("sub class");
    }

}

