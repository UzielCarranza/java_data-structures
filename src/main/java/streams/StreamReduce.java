package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class StreamReduce {

    public static void main(String[] args) {

        //        Initialize array of numbers
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        convert array to list
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));

//        create binary unction that will be pass down to the reduce function
        BinaryOperator<Integer> getSum = (accumulator, currentElement) -> {
//            get the sum from the accumulator and current element
            Integer result = accumulator + currentElement;
//            shows what happens when it's used on the reduce function
            System.out.println("ACC: " + accumulator + " CURRENT ELEMENT " + currentElement + " RESULT: " + result);
            return result;

        };


    }
}
