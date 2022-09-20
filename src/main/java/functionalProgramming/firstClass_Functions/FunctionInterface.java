package functionalProgramming.firstClass_Functions;

import java.util.function.Function;

public class FunctionInterface {

    protected static class MyMath{
//        takes integer argument an returns that number times three
        public static Integer triple(Integer x){
            return x * 3;
        }

    }

    public static void main(String[] args) {

//        use java's function interface to create a reference to the MyMath classes triple function
        Function<Integer, Integer> myTriple = MyMath::triple;

//        call the myTriple function
        Integer result = myTriple.apply(5);

        System.out.println(result);
    }
}
