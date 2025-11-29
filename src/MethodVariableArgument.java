public class MethodVariableArgument {
    public static void main(String[] args) {

        int[] values = {80, 75, 60};
        sayCongrats("John", values);
        sayCongrats("Jane", 90, 85, 95);
    }

    static void sayCongrats(String name, int ...values) {
        var total = 0;

        for (var value : values) {
            total += value;
        }

        var finalValue = total / values.length;

        if (finalValue >= 75) {
            System.out.println("Congratulations " + name + ", you passed with a final score of " + finalValue);
        } else {
            System.out.println("Sorry " + name + ", you did not pass. Your final score is " + finalValue);
        }
    }
}
