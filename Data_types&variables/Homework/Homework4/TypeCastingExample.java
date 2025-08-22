// Homework 4 – Type Casting Example
public class TypeCastingExample {
    public static void main(String[] args) {
        int a = 10;
        double b = a;      // Widening
        double d = 9.78;
        int i = (int) d;   // Narrowing

        System.out.println("Int to Double (Widening): " + b);
        System.out.println("Double to Int (Narrowing): " + i);
    }
}
