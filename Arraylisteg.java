import java.util.AbstractList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Arraylisteg {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(0, 10);
        list.add(1, 12);
        list.add(null);
        System.out.println(list);
        System.out.println(list.contains(12));

        //for(int i=0;i<list.size();i++){
        //System.out.println(list.get(i));}
        // for (String i:list){
        //   System.out.println(i);
        // }
        System.out.println(list);
        System.out.println(list.isEmpty());
        List<String> list1 = new ArrayList<>();
        // list1.addAll(list);
        System.out.println(list1.isEmpty());
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(4);
        list4.add(41111);
        list4.add(41);
        list4.add(411);
        list4.add(4111);
        //System.out.println(list4.indexOf(3));
        System.out.println(list4.lastIndexOf(41));
        System.out.println(list4);
    }}
