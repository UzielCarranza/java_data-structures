package DataStructures.Recursion;

public class Fibonacci {

    public Fibonacci() {
    }

    public int fibonacci(int number)
    {
        if(number == 1 || number == 2)
        {
            return 1;
        }
        return fibonacci(number-1) + fibonacci(number -2);
    }
}
