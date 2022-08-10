import java.util.*;
public class Triangle{
    public static void main(String[] args) {
        int rows=6, i, j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows in pattern");
        rows = sc.nextInt();
        for(i = rows; i >0; i--) {
            for(j=i; j >0; j--) {
                System.out.print("2");
            }
            System.out.println("s");
        }
    }
}