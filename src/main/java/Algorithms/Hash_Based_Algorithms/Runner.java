package Algorithms.Hash_Based_Algorithms;

import java.util.HashMap;

public class Runner {

    public static void displayFreqOfEachElements(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int x : arr) {
            if (!freqMap.containsKey(x)) {
                freqMap.put(x, 1);
            } else {
                freqMap.put(x, freqMap.get(x) + 1);
            }
        }

        freqMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }

    public static void main(String[] args) {
//        Employee employee1 = new Employee(
//                "Robby",
//                3827,
//                "Technology"
//        );
//        Employee employee2 = new Employee(
//                "Bobby",
//                9612,
//                "Marketing"
//        );
//
////        Using hashmap to store employees by ID
//        HashMap<Integer, Employee> employeeById = new HashMap<>();
//        employeeById.put(employee1.id, employee1);
//        employeeById.put(employee2.id, employee2);
//

        displayFreqOfEachElements(new int[]{4, 4, 4, 3, 2, 3, 4, 5, 4, 32, 1, 2, 4, 4, 5, 6, 6, 7, 8, 8, 5, 5, 6, 5, 4, 4});
    }
}
