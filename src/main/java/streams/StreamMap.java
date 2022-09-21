package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMap {

    public static void main(String[] args) {

//        Initialize array of numbers
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        convert array to list
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        System.out.println(listOfIntegers);

//        function that multiplies an argument by 2
        Function<Integer, Integer> timesTwo = (x) -> x * 2;

//        CONVERT LIST TO STREAM

//        Start by defining a new list
        List<Integer> doubled = listOfIntegers
//                we call stream() to convert it into a stream
                .stream()
//                creates a new version of the data with the specific function parameter that we pass it
                .map(timesTwo)
//                take the data and change it to a list
                .collect(Collectors.toList());
        System.out.println("STREAM");
//        we end up with a list where all integers have been multiplied by two
        System.out.println(doubled);

    }
}
