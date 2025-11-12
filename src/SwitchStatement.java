public class SwitchStatement {
    public static void main(String[] args) {
        var score = "E";

        switch (score) {
            case "A":
                System.out.println("Wow, you did great!");
                break;
            case "B":
            case "C":
                System.out.println("Well done, keep trying!");
                break;
            case "D":
                System.out.println("You passed, but there's room for improvement.");
                break;
            default:
                System.out.println("Maybe you chose the wrong major?");
                break;
        }

        // switch lambda style
        switch (score) {
            case "A" -> System.out.println("Wow, you did great!");
            case "B", "C" -> System.out.println("Well done, keep trying!");
            case "D" -> System.out.println("You passed, but there's room for improvement.");
            default -> System.out.println("Maybe you chose the wrong major?");
        }

        // Using switch as a yield
        String message = switch (score) {
            case "A":
                yield "Wow, you did great!";
            case "B", "C":
                yield "Well done, keep trying!";
            case "D":
                yield "You passed, but there's room for improvement.";
            default:
                yield "Maybe you chose the wrong major?";
        };
        System.out.println(message);
    }
}
