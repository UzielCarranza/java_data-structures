package DataStructures;
import java.util.Arrays;

public class Array {

    public Array() {

    }


    public void ArrayExample() {
        String[] weekdays = new String[7];

        System.out.println(Arrays.toString(weekdays));


        weekdays[0] = "Monday";
        System.out.println(Arrays.toString(weekdays));
        weekdays = new String[]{"tuesday", "wednesday", "sat"};
        System.out.println(Arrays.toString(weekdays));

        for (String day : weekdays){
            System.out.println("days is " + day);
        }

    }


    public void arrayToUpperCase(String[] input){
        for (int i = 0; i < input.length; i++){
            input[i] = input[i].toUpperCase();
        }
    }
}
