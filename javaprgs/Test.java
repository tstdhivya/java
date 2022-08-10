package javaprgs;

public class Test {
    public static void main(String[] args){
        Test2 b1 = new Test2("S",90);
        b1.setName("Google");
        System.out.println(b1.amt);

    }
}
class  Test2{
 private String name;
 public int amt;
    public Test2(String name,int amt) {
        this.name = name;
        this.amt=amt;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmt() {
        return amt;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }
}