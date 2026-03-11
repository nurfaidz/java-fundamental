import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getAverage() {
        if (grades.isEmpty()) return 0;
        double total = 0;

        for (double g : grades) {
            total += g;
        }

        return total/grades.size();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }
}
