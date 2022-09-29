package practiceFolder;

import java.util.function.Function;

public class PasswordComplexityEvaluator {
//    Create a function that checks if a password has

    //    at least six characters
//    at least one uppercase
//   at least  one lower case
//    at least one number
    public static void main(String[] args) {

        Function<String, Boolean> isPasswordComplex = (password) -> {
            if (password.length() >= 6) {
                if (password.chars().anyMatch(Character::isUpperCase)) {
                    return true;
                }
            }
            return false;
        };

        System.out.println("Contains at least one Uppercase character");
        System.out.println(isPasswordComplex.apply("hello") + " First test");
        System.out.println(isPasswordComplex.apply("Hello") + " Second test");
        System.out.println(isPasswordComplex.apply("hElLo World") + " Third test");
    }

}
