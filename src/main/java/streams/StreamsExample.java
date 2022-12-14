package streams;

import data.Student;

import java.util.function.Predicate;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentGradePredicate = ((student) -> student.getGradeLevel() >= 3);
        Predicate<Student> studentGpaPredicate = ((student) -> student.getGpa() >= 3.9);

        // Student name and there activities in a map
//        Map<String, List<String>> studentMap = StudentDataBase.getAllStudents()
//            .stream()
//            // .peek((student) -> System.out.println(student)) // Good for debugging streams
//            .filter(studentGradePredicate) // Stream<Students>
//            .peek((student) -> System.out.println("after 1st filter " + student)) // Peeking after 1st filter
//            .filter(studentGpaPredicate) // Stream<Students>
//            .collect(Collectors.toMap(Student::getName, Student::getActivities)); // <Map>

//        System.out.println(studentMap);
    }
}
