package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMap {

    public static void main(String[] args) {

//        Initialize array of numbers
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        System.out.println(listOfIntegers);
    }
}
