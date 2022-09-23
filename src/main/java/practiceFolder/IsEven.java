package practiceFolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IsEven {

    public static void main(String[] args) {

//        Create array of integers
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        convert array of nums to a list of nums
        List<Integer> numsToList = new ArrayList<Integer>(Arrays.asList(numbers));

// predicate that returns true when the numbers are even
        Predicate<Integer> isEven = (num) -> num % 2 == 0;

//        create new list to hold filtered items
        List<Integer> evenNums = numsToList
//                stream over the list of nums
                .stream()
//                takes a function argument... we passed the isEven predicate to filter out nums that are even
                .filter(isEven)
//                convert filtered streams into a list
                .collect(Collectors.toList());
        System.out.println(evenNums);


    }
}
