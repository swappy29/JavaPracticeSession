package method_overloading;

public class varargs {
    public static void main(String[] args) {
        // write your code here
        display1 obj=new display1();
        obj.show(5,6,7);
    }

}
class display1
{


    public void show(int ... i) {
        for(int k:i)

        System.out.println(k);
    }



}
