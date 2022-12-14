package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFindFirstExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> studentOptionalFindAny = findAnyStudent();
        Optional<Student> studentOptionalFindFirst = findFirstStudent();

        if (studentOptionalFindAny.isPresent()) {
            System.out.println("Found the student: " + studentOptionalFindAny.get());
        } else {
            System.out.println("Student not found!");
        }

        if (studentOptionalFindFirst.isPresent()) {
            System.out.println("Found the student: " + studentOptionalFindFirst.get());
        } else {
            System.out.println("Student not found!");
        }
    }
}
