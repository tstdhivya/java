import java.util.Scanner;
public class Loop4 {
    public static void main(String[] args)
    {
        Scanner value =new Scanner(System.in);
        int n = value.nextInt();
        do{
            System.out.println(n);
            n++;
        }
        while(n<=6);

    }
}
