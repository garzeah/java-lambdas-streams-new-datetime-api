package functionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        // Doesn't take any input, only supplies
        Supplier<Student> studentSupplier = () -> new Student("Adam", 2, 3.6, "male", Arrays.asList("swimming", "basketball", "volleyball"));;
        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is : " + studentSupplier.get());

        System.out.println("Students are : " + listSupplier.get());
    }
}
