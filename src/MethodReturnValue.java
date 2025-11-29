public class MethodReturnValue {
    public static void main(String[] args) {
        int result = sum(10, 20);
        System.out.println("The sum is: " + result);

        System.out.println(operation(15, "+", 5));
        System.out.println(operation(15, "-", 5));
    }

    static int sum(int a, int b) {
        var total = a + b;

        return total;
    }

    static int operation(int a, String op, int b) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.println("Unsupported operation");
                return 0;
        }
    }
}
