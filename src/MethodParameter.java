public class MethodParameter {
    public static void main(String[] args) {
        greet("John", "Doe");
        greet("Jane", "Smith");
    }

    static void greet(String firstName, String lastName) {
        System.out.println("Hello, " + firstName + " " + lastName + "!");
    }
}
