// WAP to take input days from the user and convert it into years, months, and remaining days.
import java.util.*;
public class Conversion 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int days=sc.nextInt();
        int years=days/365;
        int months=(days%365)/30;
        int remainingDays=(days%365)%30;
        System.out.println("The number of years is "+ years);
        System.out.println("The number of months is "+ months);
        System.out.println("The number of remaining days is "+ remainingDays);
    }
}
