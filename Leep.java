import java.util.Scanner;
public class Leep {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = in.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;

        if (x && y)
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
    }
}
