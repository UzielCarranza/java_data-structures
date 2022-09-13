package Algorithms.Hash_Based_Algorithms;

import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        Employee employee1 = new Employee(
                "Robby",
                3827,
                "Technology"
        );
        Employee employee2 = new Employee(
                "Bobby",
                9612,
                "Marketing"
        );

//        Using hashmap to store employees by ID
        HashMap<Integer, Employee> employeeById = new HashMap<>();
        employeeById.put(employee1.id, employee1);
        employeeById.put(employee2.id, employee2);

    }
}
