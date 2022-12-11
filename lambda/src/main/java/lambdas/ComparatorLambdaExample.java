package lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        // Prior to Java 8
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 -> o1 == o2
                                         // 1 -> o1 > o2
                                         // 1 -> o1 < o2
            }
        };

        System.out.println("Result of the comparator is: " + comparator.compare(3, 2));

        // Lambda
        Comparator<Integer> comparatorLambda1 = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambda is: " + comparatorLambda1.compare(3, 2));

        Comparator<Integer> comparatorLambda2 = (a, b) -> a.compareTo(b);
        System.out.println("Result of the comparator using Lambda is: " + comparatorLambda2.compare(3, 2));
    }
}
