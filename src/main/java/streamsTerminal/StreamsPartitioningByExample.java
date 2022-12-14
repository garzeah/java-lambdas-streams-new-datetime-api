package streamsTerminal;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// partitioningBy() collector is also a kind of groupingBy()
// partitioningBy() accepts a predicate as an input
// Return type of the collector is going to be Map<K, V>
// - The key of the return type is going to be a Boolean
// There are 2 different versions of partitioningBy()
// partitioningBy(predicate)
// partitioningBy(predicate, downstream) // downstream -> could be of any collector
public class StreamsPartitioningByExample {

    public static void partitioningBy_1(){

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;
        Map<Boolean, List<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate));

        System.out.println("partitioningMap : " + partitioningMap);
    }

    public static void partitioningBy_2(){

        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.8;

        Map<Boolean, Set<Student>> partitioningMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.partitioningBy(gpaPredicate,
                        Collectors.toSet()));

        System.out.println("partitioningMap_2 : " + partitioningMap);
    }

    public static void main(String[] args) {
        //partitioningBy_1();
        partitioningBy_2();

    }
}

