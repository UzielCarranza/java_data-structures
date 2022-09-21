package functionalProgramming.firstClass_Functions;

public class Closure {


    public static void main(String[] args) {

//        no arg function takes no parameters and returns a function that returns a string
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Uziel";
//            return a function that returns a string
            return () -> "Hello" + " " + name;
        };

//        create a function that takes no arguments and creates an instance of createGreeter
        NoArgFunction<String> greeter = createGreeter.apply();

//        OUTPUT EXAMPLE IS CLOSURE
//        When we return a function, it still has access to the scope that it was returned from
        System.out.println(greeter.apply());

    }
}
