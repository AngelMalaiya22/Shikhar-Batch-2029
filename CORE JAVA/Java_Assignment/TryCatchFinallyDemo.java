// Question 3
public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        try {
            System.out.println("Accessing element at index 5...");
            int result = numbers[5];
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: Index is out of bounds!");
        } finally {
            System.out.println("Finally block executed: Cleanup work done here.");
        }

        System.out.println("Program continues after try-catch-finally block.");
    }
}