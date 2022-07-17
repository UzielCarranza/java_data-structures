package DataStructures.StacksAndQueues;

import java.util.*;

public class PartB {

    private final Queue<String> customers = new LinkedList<String>();
    private final Stack<String> stack = new Stack<>();
    Scanner sc = new Scanner(System.in);


    public PartB() {
    }

    public void Section1() {

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

    public void Stacks() {
        String str = sc.nextLine();
        System.out.println("\n");
        System.out.println("*********** Section: 2 ***********");
        System.out.println("\n");
        System.out.println("Please enter a sentence.");

        String userInput = sc.nextLine();

        // empty temporary String
        String temp = "";

        // Traversing the entire String
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == ' ') {
                // Push temporary
                // variable into the stack
                stack.add(temp);

                // Assigning temporary
                // variable as empty
                temp = "";
            } else {
                temp = temp + userInput.charAt(i);
            }

        }

        // For the last word
        // of the String
        stack.add(temp);
        String reverseWord = " ";
        while (!stack.isEmpty()) {
            // Get the words in
            // reverse order
            temp = stack.peek();
            stack.pop();
            reverseWord = temp;
            for (int i = 0; i < reverseWord.length(); i++) {
                System.out.println(temp.charAt(i));
            }
            System.out.println("\n");
        }
    }


    public void Init() {
        Section1();
        Stacks();

    }

}
