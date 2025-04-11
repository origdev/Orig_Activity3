import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    double grade;

    Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + " - " + grade;
    }
}

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many students? ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        List<Student> students = new ArrayList<>();

        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("Enter details for student #" + i);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            students.add(new Student(name, grade));
        }

        // Sort students by grade in ascending order
        Collections.sort(students, Comparator.comparingDouble(s -> s.grade));

        System.out.println("Sorted Students by Grade (Ascending):");
        for (Student student : students) {
            System.out.println(student);
        }

        scanner.close();
    }
}
