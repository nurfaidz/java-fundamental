import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeManager manager = new GradeManager();

        while (true) {
            printMenu();
            System.out.println("Choose: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.println("Enter student name: ");
                    String name = scanner.nextLine().trim();
                    manager.addStudent(name);
                    manager.showStudents();
                    break;
                case "2":
                    System.out.println("Enter student: ");
                    String student = scanner.nextLine().trim();
                    System.out.println("Enter grade's " + student + ": ");
                    try {
                        int grade = Integer.parseInt(scanner.nextLine().trim());
                        manager.addGrade(student, grade);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid number grade");
                    }
                    break;
                case "3":
                    manager.showStudents();
                    break;
                case "4":
                    manager.showRanking();
                    break;
                case "5":
                    scanner.close();
                    return;
            }
        }
    }

    public static void printMenu() {
        System.out.println(" Grade Manager ");
        System.out.println("1. Add Student");
        System.out.println("2. Add Grade");
        System.out.println("3. Show Students");
        System.out.println("4. Show Ranking");
        System.out.println("5. Exit");
    }
}