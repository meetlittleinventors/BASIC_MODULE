import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your class: ");
        String className = sc.nextLine();
        
        System.out.println("Hello " + name + ", welcome to Class " + className + "!");
    }
}
