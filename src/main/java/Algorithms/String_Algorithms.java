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


    //    REVERSE STRING
    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

//        use this so the algorithm doesn't create unnecessary data

//        when the string builder object is modified, it doesn't create a new string builder
//        instead it dynamically expands memory to accommodate the modified string
//        recommended to run mutable operations
        StringBuilder reversed = new StringBuilder();

//        start iterating from the last index
        for (int i = input.length() - 1; i >= 0; i--) {
//            appends each character to the string builder
            reversed.append(input.charAt(i));
        }

//        convert to string builder to string
        return reversed.toString();
    }


    public static String reverse_build_inOptions(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();

    }


    public static void main(String[] args) {
        System.out.println(isUpperCase("Hello"));
        System.out.println(isLowerCase("hello"));
        System.out.println(isNumeric(String.valueOf(0)));
        System.out.println();
        System.out.println("COMPLEX PASSWORD VALIDATION");
        System.out.println(isPasswordComplex("Hell0"));
        System.out.println(isPasswordComplex("hello"));
        System.out.println(isPasswordComplex("Hello"));
        System.out.println();
        System.out.println("REVERSING STRINGS");
        System.out.println(reverse("This is a sentence"));
        System.out.println(reverse_build_inOptions("This is a sentence"));

    }
}
