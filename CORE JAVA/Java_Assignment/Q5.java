public class Q5 {

    static void display(int a) {
        System.out.println("Single int parameter: " + a);
    }

    static void display(int a, int b) {
        System.out.println("Two int parameters: " + a + ", " + b);
    }

    static void display(double a) {
        System.out.println("Single double parameter: " + a);
    }

    static void display(String a, int b) {
        System.out.println("String and int parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        display(10);
        display(10, 20);
        display(5.5);
        display("Score", 100);
    }
}