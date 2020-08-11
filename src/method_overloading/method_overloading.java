package method_overloading;

public class method_overloading {
    public static void main(String[] args) {
        // write your code here
        display obj=new display();
        obj.show(5,6,7);
    }

}
class display
{


    public void show(int i) {
        System.out.println(i);
    }
    public void show(int i,int j,int k) {
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
    }
}


