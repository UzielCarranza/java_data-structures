package Recursion;


public class Assignment1 {

    public static void main(String[] args) {
//        calling an instance of Recursion.Fibonacci to access it's methods
        Fibonacci fibonacci = new Fibonacci();

        //*********************************************************
        //****Assignment 1, Section 1
        //*********************************************************
        System.out.printf("\n");
        System.out.printf("**********Section 1 **********\n");
        System.out.printf("\n");
        System.out.printf("The Recursion.Fibonacci value of 10 is: ");
        System.out.printf("%d", fibonacci.fibonacci(10));
        System.out.println("\n");

        Factorial factorial = new Factorial();

        System.out.println("\n");
        System.out.printf("**********Section 2 **********\n");
        System.out.println("\n");
//        factorial.factorial(4);
        factorial.printFactorials();


    }


}
