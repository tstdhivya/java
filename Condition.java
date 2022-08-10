import java.util.Scanner;
public class Condition {
    public static void main(String[] args) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter x");
        int x = var1.nextInt();
        int var2;
        System.out.println("Enter y");
        int y = var1.nextInt();
        int var3;
        System.out.println("Enter z");
        int z = var1.nextInt();
        if ((x < y) || (y < z)) {
            System.out.println("dd");
        } else if ((x > y) || (y > z)) {
            System.out.println("Lsess");
        }else{
            System.out.println("inva");

        }
    }

}