package oops_concepts;

public class polymorphism_overloading {
    public static void main(String[] args) {
        // write your code here

        Add2 a1=new Add2();
        a1.Add(40);



    }

}
class Add2 {

    public void Add()
    {
        System.out.println("Add");
    }
    public void Add(int i)
    {
        System.out.println("Addition");
    }

}

