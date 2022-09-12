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


    //    BINARY SEARCH
    public static boolean binarySearch(int[] arr, int item) {
//        declare min and max values
        int min = 0;
        int max = arr.length - 1;

        while (min <= max) {
//            continue to search for the item
//            declare mid value
            int mid = (min + max) / 2;
//            check if item is at the midpoint of the array
            if (item == arr[mid]) {
//                found the item
                return true;
            }
//            otherwise, search through a subarray of this inner array
            else if (item < arr[mid]) {
//                search through the front half of the array
                max = mid - 1;
            } else {
//                if the item we are searching for is greater than the item at the midpoint
//                then we need to search through the back half of the inner array
                min = mid + 1;
            }
        }

//        if item was not found
        return false;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        System.out.println(linearSearch(arr, 1));
        System.out.println(linearSearch(arr, 9));
        System.out.println();

        System.out.println("LINEAR SEARCH USING STREAM API");
        linearSearch2(arr, 1).ifPresent(System.out::println);
        linearSearch2(arr, 9).ifPresent(System.out::println);
        System.out.println();
        System.out.println("BINARY SEARCH");
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 9));

    }
}
