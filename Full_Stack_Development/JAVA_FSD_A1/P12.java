// P12 — Menu Calculator
import java.util.Scanner;
public class P12
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+ - * / %): ");
        char op = sc.next().charAt(0);

        if ((op == '/' || op == '%') && b == 0) 
            {
            System.out.println("Cannot divide by zero");
            return;
        }

        double result = 0;

        switch (op) 
        {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f\n", a, op, b, result);
    }
}