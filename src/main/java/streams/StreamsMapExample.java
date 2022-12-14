package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {
        List<String> studentList = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                // Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toList()); // List<String>

        return studentList;
    }

    public static Set<String> namesSet() {
        Set<String> studentList = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                // Student as an input -> Student Name
                .map(Student::getName) // Stream<String>
                .map(String::toUpperCase)
                .collect(Collectors.toSet()); // List<String>

        return studentList;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
