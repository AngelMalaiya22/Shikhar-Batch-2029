import java.util.Scanner;

public class Q1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();

        System.out.println("The sum of a and b is :"+ (a+b));
        System.out.println("The diff of a and b is :"+ (a-b));
        System.out.println("The divison of a and b is :"+ (a/b));
        System.out.println("The mod of a and b is : "+ (a%b));
    }
}