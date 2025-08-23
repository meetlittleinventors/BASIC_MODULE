import java.util.Scanner;

public class OperatorDemo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers (a b): ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("\n--- Arithmetic ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));     // integer division
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("a / b = undefined (division by zero)");
            System.out.println("a % b = undefined (mod by zero)");
        }

        System.out.println("\n--- Assignment & Increment ---");
        int c = a;
        System.out.println("c starts as a: " + c);
        System.out.println("c += 5 → " + (c += 5));
        System.out.println("c *= 2 → " + (c *= 2));
        System.out.println("c++ prints (old): " + (c++));
        System.out.println("after c++ c = " + c);
        System.out.println("++c prints (new): " + (++c));

        System.out.println("\n--- Relational ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a >  b : " + (a > b));
        System.out.println("a <= b : " + (a <= b));

        System.out.println("\n--- Logical ---");
        boolean bothPositive = (a > 0 && b > 0);
        boolean anyZero = (a == 0 || b == 0);
        boolean notEqual = !(a == b);
        System.out.println("a>0 && b>0 : " + bothPositive);
        System.out.println("a==0 || b==0 : " + anyZero);
        System.out.println("!(a==b) : " + notEqual);

        System.out.println("\n--- Precedence ---");
        int r1 = a + b * 2;
        int r2 = (a + b) * 2;
        System.out.println("a + b * 2   = " + r1);
        System.out.println("(a + b) * 2 = " + r2);

        System.out.println("\n--- Bonus ---");
        boolean divBy2And3 = (a % 2 == 0) && (a % 3 == 0);
        System.out.println("a divisible by 2 AND 3: " + divBy2And3);

        sc.close();
    }
}
