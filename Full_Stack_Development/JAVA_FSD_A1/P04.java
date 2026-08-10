//P04 — Type-Casting Report

public class P04 
{
    public static void main(String args[])
    {
        int a=42;
        long b;
        double c;
        b=a;
        c=b;
        System.out.println("Widening : "+ a +" -> "+ b +" -> "+ c);
        double d=99.99;
        int e;
        e=(int)d;
        System.out.println("Narrowing : "+d+" -> "+e);
        char f='A';
        int g=f;
        System.out.println("'A' code : "+g);
        int h=66;
        char i=(char)h;
        System.out.println("66 code : "+i);
    }
}
