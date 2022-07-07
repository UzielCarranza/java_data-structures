package Recursion;

public class Factorial {


//    constructor
    public Factorial() {
    }

//    methods
    public void factorial(int number){
        int fact = 1;
        int counter = 1;
        System.out.println("1! is " + 1);

//        for loop to iterate over the number
        for (int i = 2; i <= number; i++){
            counter += 1;
            fact = fact * i;
            System.out.println(counter + "!" + " is " + fact);
        }

    };


}
