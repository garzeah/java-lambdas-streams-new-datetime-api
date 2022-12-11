package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = ((students) -> {
        Map<String, Double> studentGradeMap = new HashMap<>();

        students.forEach((student) -> {
            if (PredicateStudentExample.p1.test(student))
            studentGradeMap.put(student.getName(), student.getGpa());
        });

        return studentGradeMap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
