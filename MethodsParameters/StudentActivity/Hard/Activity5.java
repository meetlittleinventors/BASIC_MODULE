class Activity5 {
    static int calculate(int a, int b) {   // sum
        return a + b;
    }

    static double calculate(double a, double b) {  // product
        return a * b;
    }

    static String calculate(String s1, String s2) {  // concatenate
        return s1 + s2;
    }

    static int calculate(int... nums) {  // varargs: sum all
        int sum = 0;
        for (int n : nums) sum += n;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("calculate(int,int): " + calculate(5, 10));
        System.out.println("calculate(double,double): " + calculate(2.5, 4.0));
        System.out.println("calculate(String,String): " + calculate("Hello ", "World"));
        System.out.println("calculate(varargs): " + calculate(1, 2, 3, 4, 5));
    }
}
