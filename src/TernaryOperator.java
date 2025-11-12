public class TernaryOperator {
    public static void main(String[] args) {
        var score = 55;
        String message;

        if (score >= 90) {
            message = "Wow, you did great!";
        } else if (score >= 75) {
            message = "Well done, keep trying!";
        } else if (score >= 60) {
            message = "You passed, but there's room for improvement.";
        } else {
            message = "Maybe you chose the wrong major?";
        }

        // Using ternary operator
        String msg = (score >= 90) ? "Wow, you did great!"
                : (score >= 75) ? "Well done, keep trying!"
                : (score >= 60) ? "You passed, but there's room for improvement."
                : "Maybe you chose the wrong major?";

        System.out.println(message);
        System.out.println(msg);
    }
}
