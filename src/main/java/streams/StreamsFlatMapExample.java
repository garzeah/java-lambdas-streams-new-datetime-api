package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities() {
        List<String> studentActivities = StudentDataBase.getAllStudents()
                .stream() // Stream<Student>
                .map(Student::getActivities) // Stream<List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // Stream<String> -> Gets all unique values
                .sorted()
                .collect(Collectors.toList());
//                .count(); // Counts all values

        return studentActivities;
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities : " + printStudentActivities());
    }
}
