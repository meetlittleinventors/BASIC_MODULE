import java.util.Scanner;
public class Medium2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        int science = sc.nextInt();
        if(maths >= 40 && science >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
        sc.close();
    }
}
