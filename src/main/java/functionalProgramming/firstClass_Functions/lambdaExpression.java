package functionalProgramming.firstClass_Functions;

import java.util.function.Function;

public class lambdaExpression {
    public static void main(String[] args) {
//        returns the absolute value of an integer

//        defines a new function from scratch
        Function<Integer, Integer> absoluteValue = (x) -> x < 0 ? -x : x;
        System.out.println(absoluteValue.apply(-100));
    }
}
