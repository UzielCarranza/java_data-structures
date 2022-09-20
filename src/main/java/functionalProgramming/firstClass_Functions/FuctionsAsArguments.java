package functionalProgramming.firstClass_Functions;

import java.util.function.BiFunction;

public class FuctionsAsArguments {

    protected static class MyMath {
        public static Integer add(Integer x, Integer y) {
            return x + y;

        }

        public static Integer subtract(Integer x, Integer y) {
            return x - y;
        }

        //        function that receives a function that says what to do with two numbers that were already in a function
        public static Integer combine2And3(BiFunction<Integer, Integer, Integer> combineFunction) {
            return combineFunction.apply(2, 3);
        }
    }

    public static void main(String[] args) {
//        call predefined methods
//        calls the combine 2 and 3 function that calls the add function
        System.out.println(MyMath.combine2And3(MyMath::add));


//        calls the combine 2 and 3 function that calls the subtract function
        System.out.println(MyMath.combine2And3(MyMath::subtract));

        System.out.println(MyMath.combine2And3((x, y) -> 2 * x + 2 * y));
    }
}
