package functionalProgramming.firstClass_Functions;

import java.util.function.BiFunction;

public class biFunctions {

    public static void main(String[] args) {


//        bi functions take 3 parameters,
//        in this example, the first two parameters are the parameters that the function will take, and the
//        3rd will be the type of rerutning data
        BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
        System.out.println(add.apply(5,5));
    }
}
