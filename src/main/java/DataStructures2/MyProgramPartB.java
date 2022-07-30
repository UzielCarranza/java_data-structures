package DataStructures2;

import java.util.Arrays;
import java.util.Collections;

public class MyProgramPartB {
    //    constructor
    public MyProgramPartB() {

    }

    //    methods
    public void bubbleSort() {
        System.out.println("********** Section 1 – Bubble Sort **********" + "\n");

        //        create array that holds student grades
        int[] studentGrades = {65, 95, 75, 55, 56, 90, 98, 88, 97, 78};

        printArray(studentGrades);
        System.out.println("\n");
        sortArrayDescBS(studentGrades);
        System.out.println("\n");
        sortArrayAscBS(studentGrades);
        System.out.println("\n");
    }

    //     implements a bubble sort algorithm that will sort the grade array from highest to lowest
    public void sortArrayDescBS(int[] grades) {
        int temp;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades.length; j++) {
                if (grades[i] > grades[j]) {
                    temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order");
        for (int num : grades) {
            System.out.println(num);
        }
    }

    //     implements a bubble sort algorithm that will sort the grade array from lowest to highest
    public void sortArrayAscBS(int[] grades) {
        int temp;
        for (int i = 0; i < grades.length; i++) {
            for (int j = 0; j < grades.length; j++) {
                if (grades[i] < grades[j]) {
                    temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                }
            }
        }
        System.out.println("Array elements in ascending order");
        for (int num : grades) {
            System.out.println(num);
        }
    }

    //    print all elements within array of integers
    public void printArray(int[] grades) {
        System.out.println("The unsorted list of grades is,");
        for (int grade : grades) {
            System.out.println(grade);
        }
    }


    public void quickSort() {
        //        create array that holds student grades
        int[] studentGrades = {65, 95, 75, 55, 56, 90, 98, 88, 97, 78};
        System.out.println("*********** Section: 2 – Quick Sort ***********" + "\n");

//        unsorted list
        System.out.println("The unsorted list of grades is: ");
        for (int grade : studentGrades) {
            System.out.println(grade);
        }
//
        System.out.println("\n");

//        descending order
        System.out.println("The grades in descending order are,");
        sortArrayDescQS(studentGrades, studentGrades.length);
        for (int grade : studentGrades) {
            System.out.println(grade);
        }
//
        System.out.println("\n");

//        ascending order
        System.out.println("The grades in ascending order are,");
        sortArrayAscQS(studentGrades, studentGrades.length);
        for (int grade : studentGrades) {
            System.out.println(grade);
        }
//
    }

    //    implements a quick sort algorithm, using recursion, that will sort the grade array from highest to lowest
    public void sortArrayDescQS(int[] grades, int num) {
//        based case
        if (num == 1) {
            return;
        }

        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i = 0; i < num - 1; i++)
            if (grades[i] < grades[i + 1]) {
                // swap arr[i], arr[i+1]
                int temp = grades[i];
                grades[i] = grades[i + 1];
                grades[i + 1] = temp;
            }
        // Largest element is fixed,
        // recur for remaining array
        sortArrayDescQS(grades, num - 1);
    }


    //    implements a quick sort algorithm, using recursion, that will sort the grade array from lowest to highest
    public void sortArrayAscQS(int[] grades, int num) {
//        based case
        if (num == 1) {
            return;
        }

        // One pass of bubble sort. After
        // this pass, the smallest element
        // is moved (or bubbled) to end.
        for (int i = 0; i < num - 1; i++)
            if (grades[i] > grades[i + 1]) {
                // swap arr[i], arr[i+1]
                int temp = grades[i];
                grades[i] = grades[i + 1];
                grades[i + 1] = temp;
            }
        // Largest element is fixed,
        // recur for remaining array
        sortArrayAscQS(grades, num - 1);
    }

    //    Sequential Search
    public void section3() {
        System.out.println("\n");
        System.out.println("*********** Section: 3 – Sequential Search ***********" + "\n");

        int[] studentGrades = {65, 95, 75, 55, 56, 90, 98, 88, 97, 78};
        sortArrayAscQS(studentGrades, studentGrades.length);
        System.out.println("The contents of the grade array are: ");
        for (int grade : studentGrades){
            System.out.println(grade);
        }
        System.out.println(seqSearch(studentGrades, 75));
        System.out.println(seqSearch(studentGrades, 60));


    }

    public String seqSearch(int[] array, int valueToBeFound) {
        System.out.println();

        String message = "Number " + valueToBeFound + " was not found";
        // if array is Null
        if (array == null) {
            return message;
        }

        // find length of array
        int len = array.length;
        int i = 0;

        // traverse in the array
        while (i < len) {

            // if the i-th element is t
            // then return the index
            if (array[i] == valueToBeFound) {
                message = "number " + valueToBeFound +  " was found at index: " + i;
                return message;
            } else {
                i = i + 1;
            }
        }
        return message;

    }
}
