public class Q8 {
    public static void main(String[] args) {
        // 1. String - Immutability
        String str = "Hello";
        str.concat(" World");
        System.out.println("String (Immutable): " + str); // Remains "Hello"

        str = str.concat(" World");
        System.out.println("String (Reassigned): " + str);

        // 2. StringBuilder - Mutable, non-thread-safe (Fast)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder (Mutable): " + sb);

        // 3. StringBuffer - Mutable, thread-safe (Synchronized)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer (Thread-Safe): " + sbf);
    }
}