// WAP to input 3 number from the user and print the numbers in desecending order
import java.util.Scanner;
import java.util.Arrays;
public class Print_In_Desecending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int arr[]=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]);
        }
    }
}