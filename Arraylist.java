import java.awt.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer>Num=new ArrayList<Integer>();
        Num.add(0,10);
        Num.add(1,26);
        System.out.println(Num);
        List<String>Num1=new ArrayList<String>();
        Num1.add("DHIVYA");
        Num1.add("PRIYA");
        System.out.println(Num1);
        System.out.println(Num1.get(0));
    System.out.println(Num1.size());
        LinkedList<Integer>Num3=new LinkedList<Integer>();
        Num3.add(0,56);
        System.out.println(Num3.get(0));
        System.out.println(Num1);

    }
}
