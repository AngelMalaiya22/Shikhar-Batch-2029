// P07 — Interest Calculator
import java.util.Scanner;
public class P07 
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Principal : ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate of Interest : ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time in Years : ");
        double time = sc.nextDouble();
        System.out.println("Simple Interest : " + (principal * rate * time) / 100);
        System.out.println("Compound Interest : " + (principal * Math.pow((1 + rate / 100), time) - principal));
        System.out.println("Maturity : "+ (principal + (principal * Math.pow((1 + rate / 100), time) - principal)));
    }
}
