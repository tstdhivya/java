import java.util.Scanner;
public class Methodeg2 {
    void apple(){
        System.out.println("FRUIT");
    }
    int x=20,y=38;
    void apples(){
        System.out.println(x+y);}
    static double add1(Double c,Double d){
        return (c+d);
    }
        static String name(String name1,String name2){
        return name1+name2;
    }
    static void multiply(int a,int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        Methodeg2 m=new Methodeg2();
        m.apple();
        m.apples();
        System.out.println(add1(12.0,17.0));
        System.out.println("dhiv"+"ya");
        multiply(2,4);
    }
}