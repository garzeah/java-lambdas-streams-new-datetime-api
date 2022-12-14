package streams;

import data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.9);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 3.9);
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.0);
    }

    public static void main(String[] args) {
        // False because not all students have a gpa for >= 3.9
        System.out.println("Result of All Match: " + allMatch());
        System.out.println("Result of Any Match: " + anyMatch());
        System.out.println("Result of None Match: " + noneMatch());
    }
}
