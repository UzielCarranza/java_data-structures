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

    public static void main(String[] args) {
        System.out.println(isUpperCase("Hello"));
        System.out.println(isLowerCase("hello"));
        System.out.println(isNumeric(String.valueOf(0)));

    }
}
