public class Q6 {
    public static void main(String[] args) {
        int primitiveInt = 42;
        Integer boxedInt = primitiveInt;

        Integer wrapperObj = Integer.valueOf(100);
        int unboxedInt = wrapperObj;

        String strVal = "250";
        int parsedInt = Integer.parseInt(strVal);
        String convertedStr = String.valueOf(primitiveInt);

        int intVal = 75;
        double implicitDouble = intVal;

        double doubleVal = 99.99;
        int explicitInt = (int) doubleVal;

        System.out.println("Autoboxing (int -> Integer): " + boxedInt);
        System.out.println("Unboxing (Integer -> int): " + unboxedInt);
        System.out.println("Type Conversion (String -> int): " + parsedInt);
        System.out.println("Type Conversion (int -> String): " + convertedStr);
        System.out.println("Implicit Casting (int -> double): " + implicitDouble);
        System.out.println("Explicit Casting (double -> int): " + explicitInt);
    }
}