public class BooleanOperation {
    public static void main(String[] args) {
        var absent = 75;
        var finalScore = 80;

        var passAbsent = absent >= 75;
        var passFinalScore = finalScore >= 75;

        var pass = passAbsent && passFinalScore;
        System.out.println(pass);
    }
}
