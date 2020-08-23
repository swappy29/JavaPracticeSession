package oops_concepts;

public class encapsulationdemo {
    public static void main(String[] args) {
        // write your code here

        emp e1=new emp();
        e1.setEmpid(102);
        e1.setEmpnm("Swapnil");
        emp e2=new emp();
        e2.setEmpid(103);
        e2.setEmpnm("Swap");
        System.out.println(e1.getEmpid());
        System.out.println(e1.getEmpnm());
        System.out.println(e2.getEmpid());
        System.out.println(e2.getEmpnm());
    }

}
class emp {
    private int empid;
    private String empnm;
    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpnm() {
        return empnm;
    }

    public void setEmpnm(String empnm) {
        this.empnm = empnm;
    }


}


