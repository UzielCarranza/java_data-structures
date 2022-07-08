import DataStructures.Array;
import org.testng.annotations.Test;

public class ArrayTest {

    @Test
    public void ArrayTestToUpperCase(){

        Array arrayExercise = new Array();

        String[] input = new String[]{"mon", "tues", "wed"};
        arrayExercise.arrayToUpperCase(input);
    }

}
