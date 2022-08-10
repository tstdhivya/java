package javaprgs;

import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {

      System.out.println("enter a val");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0;i<a;i++){
            if (i==5)
               continue;;
            System.out.println(i);

        }
    }
}
