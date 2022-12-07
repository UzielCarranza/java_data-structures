package generics;

import java.util.ArrayList;
import java.util.List;

public class NonGenericsCode {
    /*
     * ! PROBLEMS WITH GENERICS
     */

    public static void main(String[] args) {
        List languages = new ArrayList<>();
        languages.add("Englih");
        Object value = new String("Swit");
        languages.add(value);

//        whenever you try to process these values that have been written with
//        generalized code
//        you will need to do an explicit casting

        processLanguages(languages);

    }

    private static void processLanguages(List data) {
//        TODO:1ST PROBLEM
//        since we need to cast the parameters into a string, this will introduce a lot of clustering in the code

//        TODO:2ND PROBLEM THIS CODE LACKS TYPE SAFETY
        String language = (String) data.get(0);
        System.out.println(language);
    }
}
