// WAP to take input 1 number from the user and print its square and cube.
import java.util.Scanner;
public class SquareAndCube 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("The square of a is "+ (a*a));
        System.out.println("The cube of a is "+ (a*a*a));
    }
}
