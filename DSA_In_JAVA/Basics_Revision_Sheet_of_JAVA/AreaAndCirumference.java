// WAP to calculate and print area of circle and circumference of circle.
import java.util.Scanner;
public class AreaAndCirumference 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double r=sc.nextDouble();
        System.out.println("The area of circle is "+ (3.14*r*r));
        System.out.println("The circumference of circle is "+ (2*3.14*r));
    }
}
