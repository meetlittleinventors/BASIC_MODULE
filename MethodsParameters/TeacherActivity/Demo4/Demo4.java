class Demo4 {
    static int square(int n) { // returns a value
        return n * n;
    }

    static void printSquare(int n) { // prints directly
        System.out.println("printSquare(): " + (n * n));
    }

    public static void main(String[] args) {
        int result = square(6);
        System.out.println("square(6) returned: " + result);

        printSquare(6);
    }
}
