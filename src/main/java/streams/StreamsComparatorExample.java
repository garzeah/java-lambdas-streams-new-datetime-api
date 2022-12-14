package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {

    public static List<Student> sortStudentsByName() {
        List<Student> students = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        return students;
    }

    public static List<Student> sortStudentsByGpa() {
        List<Student> students = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());

        return students;
    }

    public static List<Student> sortStudentsByGpaDesc() {
        List<Student> students = StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());

        return students;
    }

    public static void main(String[] args) {
        System.out.println("Students sorted by Name: " );
        sortStudentsByName().forEach(System.out::println);
        System.out.println("Students sorted by GPA ascending: ");
        sortStudentsByGpa().forEach(System.out::println);
        System.out.println("Students sorted by GPA descending: ");
        sortStudentsByGpaDesc().forEach(System.out::println);
    }
}
