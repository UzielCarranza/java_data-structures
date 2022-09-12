package Algorithms;

import DataStructures.Array;

import java.util.Arrays;
import java.util.OptionalInt;

public class Array_Algorithms {

    //    searching for data within an array data structure
    public static Integer linearSearch(int[] arr, int item) {
        for (int current : arr) {
            if (current == item) {
                return item;
            }
        }
        return null;
    }


    //    searching for data within an array data structure using array stream
//    an optional acts as a container object, to help prevent null exceptions
    public static OptionalInt linearSearch2(int[] arr, int item) {
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        System.out.println(linearSearch(arr, 1));
        System.out.println(linearSearch(arr, 9));
        System.out.println();

        System.out.println("LINEAR SEARCH USING STREAM API");
        linearSearch2(arr, 1).ifPresent(System.out::println);
        linearSearch2(arr, 9).ifPresent(System.out::println);

    }
}
