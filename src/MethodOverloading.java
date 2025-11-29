public class MethodOverloading {
    public static void main(String[] args) {

        sayHello();
        sayHello("Alice");
        sayHello("Bob", "Good morning");

    }

    static void sayHello() {
        System.out.println("Hello!");
    }

    static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static void sayHello(String name, String greeting) {
        System.out.println(greeting + ", " + name + "!");
    }
}
