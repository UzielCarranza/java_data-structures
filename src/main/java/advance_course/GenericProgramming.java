package advance_course;

public class GenericProgramming {


//    VARARGS METHOD
//    Using the varags, I can pass in one item, two items, no items, or an array of items
    private static void printShoppingList(String... items){
        System.out.println("Shopping List" + "\n");

        for (String item : items){
            System.out.println(item);
        }
    }


}
