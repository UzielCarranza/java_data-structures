package advance_course;

public class GenericProgramming {


    //    VARARGS METHOD
//    Using the varargs, I can pass in one item, two items, no items, or an array of items
    private static void printShoppingList(String... items) {
        System.out.println("Shopping List" + "\n");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String item1 = "Apples";
        String item2 = "Orange";
        String item3 = "Pears";
        String[] shopping = {"bread", "milk", "eggs", "bananas"};

//        passing strings without creating an array to hold this items
//        varargs will create one
        printShoppingList(item1, item2, item3);


//        method also works when passing existing arrays
        printShoppingList(shopping);
    }


}
