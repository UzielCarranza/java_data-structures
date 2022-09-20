package functionalProgramming.firstClass_Functions;

import java.util.function.BiFunction;

public class biFunctions {

    public static void main(String[] args) {


//        bi functions take 3 parameters,
//        in this example, the first two parameters are the parameters that the function will take, and the
//        3rd will be the type of rerutning data
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(5, 5));


//        TRI FUNCTION
//        uses the customized interface to create a function that takes three parameters
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (a, b, c) -> a + b + c;
        System.out.println(triFunction.apply(2,2,2));

//        NO ARGUMENTS FUNCTION
        NoArgFunction<String> sayHello = () -> "Hello World";
        System.out.println(sayHello.apply());
    }
}
