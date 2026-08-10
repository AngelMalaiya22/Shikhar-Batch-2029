//P03 — Swap Without a Third Variable
import java.util.Scanner;
public class P03 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b=sc.nextInt();
        System.out.println("Before: a = " + a + ", b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After: a = " + a + ", b = " + b);
    }
    
}
