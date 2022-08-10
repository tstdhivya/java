import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner value =new Scanner(System.in);
        int n = value.nextInt();
        while (n<=25) {
            System.out.println(n);
            n++;
        }
   }
}
