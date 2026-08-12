// P09 — Largest of Three
import java.util.Scanner;
public class P09 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three elements :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int Largest;
        if(a>b && a>c)
        {
            Largest = a;
        }
        else if(b>c)
        {
            Largest = b;
        }
        else
        {
            Largest = c;
        }
        System.out.println("Largest = "+ Largest);
    }
}
