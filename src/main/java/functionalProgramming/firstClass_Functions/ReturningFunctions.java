package functionalProgramming.firstClass_Functions;

public class ReturningFunctions {



    public static void main(String[] args) {

//        function that takes in a functions that returns a functions that returns a string
        NoArgFunction<NoArgFunction<String>> creategreeter = () -> {
           return  () -> "Functional Programming";
        };

        NoArgFunction<String> greeter = creategreeter.apply();
        System.out.println(greeter.apply());
    }
}
