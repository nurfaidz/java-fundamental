public class IfElseStatement {
    public static void main(String[] args) {
        var score = 70;
        var absent = 90;

        if (score >= 75 && absent >= 75) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Sorry, try this again!");
        }

        if (score >= 80 && absent >= 80) {
            System.out.println("Congratulations!");
        } else if (score >= 70 && absent >= 70) {
            System.out.println("You're score is B");
        } else if (score >= 60 && absent >= 60) {
            System.out.println("You're score is C");
        } else if (score >= 50 && absent >= 50) {
            System.out.println("You're score is D");
        } else {
            System.out.println("Sorry, try this again!");
        }
    }
}
