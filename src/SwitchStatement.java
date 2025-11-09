public class SwitchStatement {
    public static void main(String[] args) {
        var score = "A";

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
    }
}
