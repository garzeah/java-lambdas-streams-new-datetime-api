package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static int performMult(List<Integer> integerList) {
        return integerList.stream()
                //1, a=1,b=1 from stream -> result 1 is returned
                //3, a=1,b=3 from stream -> result 3 is returned
                //5, a=3,b=5 from stream -> result 15 is returned
                //7, ...
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performWithoutMult(List<Integer> integerList) {
        return integerList.stream()
                //1, a=1,b=1 from stream -> result 1 is returned
                //3, a=1,b=3 from stream -> result 3 is returned
                //5, a=3,b=5 from stream -> result 15 is returned
                //7, ...
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                // Get students one by one
                .reduce((s1, s2) -> (s1.getGpa() > s2.getGpa() ? s1 : s2));
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,3,5,7);
        System.out.println(performMult(integers));
        Optional<Integer> result = performWithoutMult(integers);
        System.out.println(result.isPresent());
        System.out.println(result.get());


        Optional<Student> studentOptional = getHighestGPAStudent();
        if (getHighestGPAStudent().isPresent()) {
            System.out.println(studentOptional.get());
        }
    }
}
