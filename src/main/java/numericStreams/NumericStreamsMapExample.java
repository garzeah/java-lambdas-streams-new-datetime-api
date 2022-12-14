package numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsMapExample {

    // Convert each element in the numeric stream to an some object
    public static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1,5)
                .mapToObj((i) -> {
                    return new Integer(i);
                })
                .collect(Collectors.toList());
    }

    // Convert a numeric stream to a long stream
    public static long mapToLong() {
        return IntStream.rangeClosed(1,5) // intstream
                // i is passed from the int stream
                .mapToLong((i) -> i) // convert intstream to longstream
                .sum();
    }

    // Convert a numeric stream to a double stream
    public static double mapToDouble() {
        return IntStream.rangeClosed(1,5) // intstream
                // i is passed from the int stream
                .mapToDouble((i) -> i) // convert intstream to longstream
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("mapToObj: " + mapToObj());
        System.out.println("mapToLong: " + mapToLong());
        System.out.println("mapToDouble: " + mapToDouble());
    }
}
