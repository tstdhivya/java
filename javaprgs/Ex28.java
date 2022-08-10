
package javaprgs;

public class Ex28 {
    String name;
    int age;
    double percentage;
    int rno;
    int total;
    public Ex28(String name, int age, double percentage, int rno, int total) {
        this.name = name;
        this.age = age;
        this.percentage = percentage;
        this.rno = rno;
        this.total = total;
    }
    public static void main(String[] args) {
        Ex28 s1 = new Ex28("Divya", 25, 89, 2033, 456);
        Ex28 s2 = new Ex28("Asha", 20, 82, 2034, 300);
        Ex28 s3 = new Ex28("Suruthi", 18, 8.0, 2035, 350);
        Ex28 s4 = new Ex28("Janani", 15, 83, 2036, 450);
        Ex28 s5 = new Ex28("Thiran", 10, 82, 2037, 470);
        System.out.println(s1.name);
        System.out.println(s2.age);
        System.out.println(s3.percentage);
        System.out.println(s4.rno);
        System.out.println(s5.total);
    }
}


