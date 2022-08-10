import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int i;
        System.out.println("Enter i");
        i = myObj.nextInt();
        if (i > 2) {
            System.out.println("childrens");
        }
        else {
            System.out.println("father");
        }
    }
}