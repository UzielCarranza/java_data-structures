package functionalProgramming.firstClass_Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ReturningFunctions {
    protected static class MyMath {
//        returns a function that takes an integer as an argument
//        multiplies that argument by the integer that we passed it to the function
        public static Function<Integer, Integer> createMultiplier(Integer y){
            return (Integer x) -> x* y;

        }
    }



    public static void main(String[] args) {

//        function that takes in a functions that returns a functions that returns a string
        NoArgFunction<NoArgFunction<String>> creategreeter = () -> {
           return  () -> "Functional Programming";
        };

        NoArgFunction<String> greeter = creategreeter.apply();
        System.out.println(greeter.apply());

//        defines how many times we want to multiple a number for
        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
//        passed the number that we are going to multiple
        System.out.println(timesTwo.apply(11));
    }
}
