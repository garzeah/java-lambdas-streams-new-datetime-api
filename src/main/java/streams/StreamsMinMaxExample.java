package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                //6
                //7
                //8
                //9
                //10
                //x variables the max value for each element in the iteration
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static int findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                .reduce(0, (x, y) -> x > y ? x : y);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);

        int maxValue = findMaxValue(integerList);
        System.out.println("maxValue is: " + maxValue);

        Optional<Integer> maxValueOptional = Optional.of(findMaxValueOptional(integerList));

        if (maxValueOptional.isPresent()) {
            System.out.println("maxValue using optional: " + maxValueOptional.get());
        } else {
            System.out.println("No max value found");
        }
    }
}
