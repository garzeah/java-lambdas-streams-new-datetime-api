package data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<data.Student> studentSupplier = () -> {
        return new data.Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"));
    };

    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<data.Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        data.Student student1 = new data.Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball"),11);
        data.Student student2 = new data.Student("Jenny",2,3.8,"female", Arrays.asList("swimming", "gymnastics","soccer"),12);
        /**
         * 3rd grade students
         */
        data.Student student3 = new data.Student("Emily",3,4.0,"female", Arrays.asList("swimming", "gymnastics","aerobics"),10);
        data.Student student4 = new data.Student("Dave",3,3.9,"male", Arrays.asList("swimming", "gymnastics","soccer"),9);
        /**
         * 4th grade students
         */
        data.Student student5 = new data.Student("Sophia",4,3.5,"female", Arrays.asList("swimming", "dancing","football"),15);
        data.Student student6 = new data.Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"),14);

        List<data.Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6);
        return students;
    }

}
