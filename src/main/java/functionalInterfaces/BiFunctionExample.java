package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = ((students, studentPredicate) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach((student) -> {
            if (studentPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });

        return studentGradeMap;
    });

    public static void main(String[] args) {
        // Filtering students based on grade level
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.p1));
    }
}
