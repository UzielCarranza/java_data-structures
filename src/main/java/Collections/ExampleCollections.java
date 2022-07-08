package Collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ExampleCollections {


    public ExampleCollections() {
    }

    public void ExampleListLinks() {
        LinkedList<String> shoppingList = new LinkedList<>();

        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);
        shoppingList.removeFirst();
        System.out.println(shoppingList);


//        makes a copy of the shopping list and makes it syncronized
        List<String> syncronizedShoppingList = Collections.synchronizedList(shoppingList);
//        tread safe
        System.out.println(syncronizedShoppingList);
    }
}
