public class ForLoop {
    public static void main(String[] args) {
        // Loop with condition
        var counter = 1;

        for (; counter <= 5; ) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        // Loop with init statement
        for (var counter2 = 1; counter2 <= 5 ;) {
            System.out.println("Counter2: " + counter2);
            counter2++;
        }

        // Loop with post statement
        for (var counter3 = 1; counter3 <= 5; counter3++) {
            System.out.println("Counter3: " + counter3);
        }
    }
}
