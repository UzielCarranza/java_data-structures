package functionalProgramming.firstClass_Functions;

public class Closure {


    public static void main(String[] args) {

//        no arg function takes no parameters and returns a function that returns a string
        NoArgFunction<NoArgFunction<String>> createGreeter = () -> {
            String name = "Uziel";
//            return a function
            return () -> "Hello" + name;
        };

    }
}
