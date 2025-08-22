// Easy 2 – Salary with Bonus
import java.util.Scanner;

public class SalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        if (salary > 10000) {
            salary += 2000;
        } else {
            salary += 1000;
        }

        System.out.println("Final Salary = " + salary);
    }
}