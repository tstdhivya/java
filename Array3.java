//import java.util.Scanner;
public class Array3 {
    public static void main(String[] args){
        int[] a1=new int[] {6,7,8,9,10};
        int[] a2=new int[a1.length];
        for (int i=0;i<a1.length;i++) {
            a2 = a1;
        }
        System.out.println(" ARRAY");
        for (int i=0;i<a1.length;i++) {
            System.out.println(a1[i] + "");
        }
        System.out.println();
        System.out.println("NEW");
        for (int i=0;i< a2.length;i++)
            System.out.print(a2[i]+"");


        }
    }
