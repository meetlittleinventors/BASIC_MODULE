import java.util.Scanner;

public class Hard1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();

        double allowance = basic * 0.2;   // 20% allowance
        double deduction = basic * 0.1;   // 10% deduction
        double netSalary = basic + allowance - deduction;

        System.out.println("Basic Salary: " + basic);
        System.out.println("Allowance: " + allowance);
        System.out.println("Deduction: " + deduction);
        System.out.println("Net Salary: " + netSalary);

        // Relational + Logical
        if(netSalary >= 50000)
            System.out.println("Salary is above threshold.");
        else
            System.out.println("Salary is below threshold.");
    }
}
