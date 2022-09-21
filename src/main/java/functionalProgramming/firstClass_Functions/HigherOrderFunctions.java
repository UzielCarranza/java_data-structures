package functionalProgramming.firstClass_Functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrderFunctions {

    public static void main(String[] args) {

//        takes two arguments and returns the first argument divided by the second argument
        BiFunction<Float, Float, Float> divide = (x, y) -> x / y;


//        takes divide function as an argument and checks if second argument is 0
        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck = (func) ->
                (x, y) -> {
                    if (y == 0f) {
                        System.out.println("error");
                        return 0f;
                    }
                    return func.apply(x, y);
                };
    }
}
