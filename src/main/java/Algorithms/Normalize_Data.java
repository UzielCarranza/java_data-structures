package Algorithms;

import java.util.Locale;

public class Normalize_Data {
    public static String normalizeString(String stringToNormalize) {
//        start by creating a normalize string
        String lowerCased = stringToNormalize.toLowerCase();
//        remove white spaces
//        using the trim function will not modify the original lowerCased string
        String trimmed = lowerCased.trim();

//        Use replace function to replace any commas to empty string
        String normalized = trimmed.replace(",", "");
        return stringToNormalize.toLowerCase().trim().replace(",", "");
    }


    public static void main(String[] args) {
        System.out.println(normalizeString("Hello theRe HERE W,e are"));

    }
}
