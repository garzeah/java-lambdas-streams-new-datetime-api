package numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {

    // Converting a primitive type to Wrapper Class type
    public static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10) // intstream of 10 elements
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    // Converting a Wrapper Class type to primitive type
    public static int unboxing(List<Integer> integerList) {
        // wrapper to primitive
        return integerList.stream()
                // Wrapper integers values
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing: " + boxing());
        List<Integer> integerList = boxing();
        System.out.println("Unboxing: " + unboxing(integerList));
    }
}
