package Algorithms;

public class String_Algorithms {


    //       find if each character within the string is uppercase
    //       by using java Streams API
    public static boolean isUpperCase(String input) {
//        create character stream that streams through the characters and checks that every character is uppercase
        return input.chars().allMatch(Character::isUpperCase);

    }

    public static boolean isLowerCase(String input) {
//        create character stream that streams through the characters and checks that every character is uppercase
        return input.chars().allMatch(Character::isLowerCase);

    }

    public static boolean isNumeric(String input) {
//        create character stream that streams through the characters and checks that every character is uppercase
        return input.chars().allMatch(Character::isDigit);

    }


//    validating complex algorithms

    public static boolean isPasswordComplex(String input) {

//        iterates over every character and checks for any character that meets the requirement
        return input.chars().anyMatch(Character::isUpperCase) &&
                input.chars().anyMatch(Character::isLowerCase) &&
                input.chars().anyMatch(Character::isDigit);

//        or in a function condition
//        input.chars().anyMatch(c -> Character.isUpperCase(c) ||
//                Character.isLowerCase(c) ||
//                Character.isDigit(c));
    }

    public static void main(String[] args) {
        System.out.println(isUpperCase("Hello"));
        System.out.println(isLowerCase("hello"));
        System.out.println(isNumeric(String.valueOf(0)));

    }
}
