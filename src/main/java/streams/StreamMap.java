package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamMap {

    public static void main(String[] args) {

//        Initialize array of numbers
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        convert array to list
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        System.out.println(listOfIntegers);

//        function that multiplies an argument by 2
        Function<Integer, Integer> timesTwo = (x) -> x * 2;


    }
}
