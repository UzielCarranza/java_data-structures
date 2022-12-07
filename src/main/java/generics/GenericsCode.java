package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsCode {
//    ! This is generifying the code
    public static void main(String[] args) {
        List<String> languages = new ArrayList<String>();
        languages.add("English");
        languages.add("Spanish");

        processLanguages(languages);
    }

    private static void processLanguages(List<String> data){
        String language = data.get(0);
        System.out.println(language);
    }
}
