package Recursion;

public class Factorial {


//    constructor
    public Factorial() {
    }

    public int factorial(int number){
        if (number == 1) {
            return number;
        }

        int recursion = number * factorial(number -1);
        System.out.println(number + "! is " + recursion);
        return recursion;
    }

    public void printFactorials() {
        System.out.println("1! is 1");
        factorial(4);

    }

}
