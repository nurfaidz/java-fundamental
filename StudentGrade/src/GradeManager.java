import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class GradeManager {
    private List<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public boolean addStudent(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println("Student already exists");
                return false;
            }
        }
        students.add(new Student(name));
        return true;
    }

    public Student findStudent(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public void addGrade(String name, int grade) {
        Student student = findStudent(name);

        if (student == null) {
            System.out.println("Student not found");
            return;
        }

        if (grade < 0 || grade > 100) {
            System.out.println("Grade is invalid");
            return;
        }

        student.addGrade(grade);
        System.out.println("add grade " + grade + " to: " + student.getName() + "!");
    }

    public void showStudents(){
        if (students.isEmpty()) {
            System.out.println("No Students");
            return;
        }

        for (Student s : students) {
            System.out.printf("%-15s | Grades: %-20s | Avg: %.2f%n",
                    s.getName(),
                    s.getGrades().toString(),
                    s.getAverage()
            );
        }
    }

    public void showRanking() {
        if (students.isEmpty()) {
            System.out.println("No Students");
            return;
        }

        List<Student> sorted = new ArrayList<>(students);
        sorted.sort(Comparator.comparingDouble(Student::getAverage).reversed());

        int rank = 1;
        for (Student s : sorted) {
            System.out.println("Rank: " + rank + " | Student: " + s.getName() + " | Average: " + s.getAverage());
            rank++;
        }
    }
}
