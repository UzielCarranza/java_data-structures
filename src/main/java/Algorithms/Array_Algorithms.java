package Algorithms;

import DataStructures.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

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


    //    find even numbers and add them to a new array
    public static int[] findEvenNums(int[] arr, int[] arr2) {
//        doing this keeps us from worrying about out of bounds exceptions
        ArrayList<Integer> result = new ArrayList<>();

        for (int num : arr) {
//            if a number is even
            if (num % 2 == 0) {
//                add it to the array list
                result.add(num);
            }
        }

        for (int num : arr2) {
//            if a number is even
            if (num % 2 == 0) {
//                add it to the array list
                result.add(num);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }


    public static int[] findEvenNums2(int[] arr, int[] arr2) {

//        takes a number and check whether a it's even
        IntPredicate isEvenPredicate = num -> num % 2 == 0;

//        create stream with both arrays
//        stream through each individual array
//        filter based on predicate
//        at the end, convert it to an array
        return Stream.of(arr, arr2).flatMapToInt(Arrays::stream).filter(isEvenPredicate).toArray();
    }


//    reverse an array in java
//first approach, copy the contents of the old array but in reverse order
    public static int[] reversedArray(int[] arr){

//        this new array contains the same length as the old one, since nothing it's been added or removed, just rearranged
        int [] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            reversed[i] = arr[arr.length -1 -i];
        }

//        this will have the contents of the original array but in reverse order
        return reversed;
    }


//    reversing array by modifying original array

    public static void reversedInPlaced(int[] arr){
        for (int i = 0; i < arr.length / 2; i++){
//            swap items at index i and index (arr.length -i -1)'
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
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


        int[] arr2 = {0, -2, -3, -8, 40, 20, 7};
        System.out.println("FIND EVEN NUMBERS");
        Arrays.stream(findEvenNums(arr, arr2)).forEach(System.out::println);
        System.out.println();
        System.out.println("Optimized algorithm");
        Arrays.stream(findEvenNums2(arr, arr2)).forEach(System.out::println);

        System.out.println("REVERSING AN ARRAY");
        System.out.println(Arrays.toString(reversedArray(arr2)));
        Arrays.stream(reversedArray(arr2)).forEach(System.out::println);
        System.out.println("new");
        reversedInPlaced(arr2);
        Arrays.stream(arr2).forEach(System.out::println);
    }
}
