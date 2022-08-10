import javaprgs.Ex28;

public class EX281 {
    String name;
    int age;
    double percentage;
    int rno;
    private int total;

    public static void main(String[] args) {
        EX281 s1 = new EX281("Divya",25,89,45,465);
        System.out.println(s1.getTotal());
        s1.setRno(46);
        System.out.println(s1.getRno());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public EX281(String name, int age, double percentage, int rno, int total) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
        this.rno = rno;
        this.total = total;
    }


}
