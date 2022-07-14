package DataStructures.StacksAndQueues;

import DataStructures.Array;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    private final Queue<String> customers = new LinkedList<String>();


    public Stack() {
    }

    public void Stacks() {
    }

    public void Init() {

        System.out.println("\n");
        System.out.println("--------------Part B---------------");
        System.out.println("--------------Section 1---------------");
        System.out.println("\n");
        customers.add("Jim");
        customers.add("Bob");
        customers.add("Susan");
        customers.add("Liz");
        customers.add("Alex");
        System.out.println("The number of people in line at the bank is: " + customers.size());
        System.out.println("\n");
        System.out.println("The names of those in line at the bank are: ");

        int counter = 0;

        for (String customer : customers) {
            counter += 1;
            if (counter == 1) {
                System.out.println(counter + "st " + customer);
            } else if (counter == 2) {

                System.out.println(counter + "nd " + customer);
            } else if (counter == 3) {


                System.out.println(counter + "rd " + customer);
            } else {

                System.out.println(counter + "th " + customer);
            }
        }
        System.out.println("\n");
        System.out.println("The first customer in line is: " + customers.peek());
        customers.add("Andy");
        customers.add("Rhonda");
        customers.remove();
        customers.remove();
        customers.remove();
        System.out.println("The number of customers in line now is: " + customers.size());
    }
}
