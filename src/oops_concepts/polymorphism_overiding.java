package oops_concepts;

public class polymorphism_overiding {
    public static void main(String[] args) {
        // write your code here

        D a1=new D();
        a1.display();



    }

}
class C {

    public void display()
    {
        System.out.println("parent class");
    }


}
class D extends  C{
    public void display()
    {
        System.out.println("sub class");
    }

}

