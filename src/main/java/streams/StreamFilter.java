package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {
        //        Initialize array of numbers
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        convert array to list
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

//        function that checks for even numbers
        Predicate<Integer> predicateIsEven = (x) -> x % 2 == 0;

        List<Integer> evens = listOfIntegers
//                convert it to a stream
                .stream()
//                call filter passing in the predicate is even function
                .filter(predicateIsEven)
//                collect the data and turn it into a list
                .collect(Collectors.toList());
        System.out.println("EVENS ");
        System.out.println(evens);

//        created a function that checks if the length is greater than a specific length within the parameter
        Function<Integer, Predicate<String>> createLengthTest = (minLength) -> {
            return (str) -> str.length() > minLength;
        };

//        predicate to check for words longer than 3
        Predicate<String> isLongerThan3 = createLengthTest.apply(3);

//        create array of words
        String[] wordsArr = {"Hello", "how are you", "doing", "today"};

//        convert array to list
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));

//        filter over the array and look for words greater than 3 in length
        List<String> longWords = words.stream().filter(isLongerThan3).collect(Collectors.toList());


        System.out.println(longWords);

    }
}
