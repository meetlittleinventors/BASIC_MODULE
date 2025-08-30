public class DataTypesDemo {
    public static void main(String[] args) {
        // 1. Declare variables of all primitive data types
        byte b = 10;
        short s = 100;
        int i = 1000;
        long l = 10000L;
        float f = 3.14f;
        double d = 3.14159;
        char c = 'A';
        boolean bool = true;

        // 2. Print their values
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + bool);

        // 3. Implicit Casting (Widening) - smaller to larger type
        int intFromByte = b;       // byte → int
        double doubleFromFloat = f; // float → double
        System.out.println("\nImplicit Casting (Widening):");
        System.out.println("Int from Byte: " + intFromByte);
        System.out.println("Double from Float: " + doubleFromFloat);

        // 4. Explicit Casting (Narrowing) - larger to smaller type
        byte byteFromInt = (byte) i; // int → byte
        float floatFromDouble = (float) d; // double → float
        System.out.println("\nExplicit Casting (Narrowing):");
        System.out.println("Byte from Int: " + byteFromInt);
        System.out.println("Float from Double: " + floatFromDouble);
    }
}
