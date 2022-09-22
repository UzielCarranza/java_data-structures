package streams;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtraPractice {

    //    create an Employee class
    protected static class Employee {
        public final String name;
        public final Integer age;
        public final String jobTitle;
        public final Float salary;

//        constructor

        public Employee(String name, Integer age, String jobTitle, Float salary) {
            this.name = name;
            this.age = age;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        public static void main(String[] args) {

//            create an array of employees containing all their information
            Employee[] employeesArr = {
                    new Employee("John", 14, "developer", 80000f),
                    new Employee("Hanna", 23, "developer", 95000f),
                    new Employee("Bart", 34, "sales executive", 100000f),
                    new Employee("Sophie", 23, "construction worker", 40000f),
                    new Employee("Darren", 56, "writer", 50000f),
                    new Employee("Nancy", 43, "developer", 70000f),

            };

//            convert array of employees to list
            List<Employee> employeeList = new ArrayList<>(Arrays.asList(employeesArr));

//            get the total sum of all developer's salary
            Float totalDeveloperSalary = employeeList
//                    stream over the list of employees
                    .stream()
//                    filter by job title
                    .filter((employee) -> employee.jobTitle == "developer")
//                    create new data containing the filtered result
                    .map((developer) -> developer.salary)
//                    get the sum of all the developer's salary
                    .reduce(0f, (acc, x) -> acc + x);

            //        find the total number of developers
            Long numberOfDevelopers = employeeList
//                    stream over the list of employees
                    .stream()
//                    filter out employees by job title
                    .filter((employee) -> employee.jobTitle == "developer")
//                    collect the total count
                    .collect(Collectors.counting());

//            get the average of developers salary
            Float averageDeveloperSalary = totalDeveloperSalary / numberOfDevelopers;
            System.out.println(averageDeveloperSalary);

        }
    }
}
