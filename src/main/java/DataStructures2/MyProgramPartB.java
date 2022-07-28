package DataStructures2;

import java.util.Arrays;
import java.util.Collections;

public class MyProgramPartB {
//    constructor
    public MyProgramPartB(){

    }

//    methods
    public void bubbleSort(){
        System.out.println("********** Section 1 – Bubble Sort **********" + "\n");

//        create array that holds student grades
        int[] studentGrades = {65, 95, 75, 55, 56, 90, 98, 88, 97,78};
        sortArrayDescBS(studentGrades);
    }

//     implements a bubble sort algorithm that will sort the grade array from highest to lowest
    public void sortArrayDescBS(int[] grades){
        int temp;
        for (int i = 0; i < grades.length; i++){
            for (int j = 0; j < grades.length; j++){
                if (grades[i] > grades[j]){
                    temp = grades[i];
                    grades[i] = grades[j];
                    grades[j] = temp;
                }
            }
        }
        System.out.println("Array elements in descending order");
//        }
        for (int num : grades){
            System.out.println(num);
        }


    }
}
