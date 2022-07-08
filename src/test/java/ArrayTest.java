import DataStructures.Array;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;


public class ArrayTest {

    Array arrayExercise = new Array();

    @Test
    public void ArrayTestToUpperCase(){


        String[] input = new String[]{"mon", "tues", "wed"};
        arrayExercise.arrayToUpperCase(input);
    }

    @Test
    public void TestIncrementArray(){
        int[] input = new int[]{1,2,3,4,5};
        arrayExercise.incrementArray(input);
        assertArrayEquals(new int[]{2,3,4,5,6}, input);
    }

}
