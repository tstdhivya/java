//import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90};
        int sum = 0;
        for (int i = 0; i < a.length; i++)
            sum = sum + a[i];
        double average = sum / a.length;
            System.out.println("Average:" + average);
        }
    }
