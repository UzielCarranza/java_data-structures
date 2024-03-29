package generics;


import java.util.ArrayList;
import java.util.List;

//create a class box and create a type parameter (T) for it
public class Box<T extends Boxable>{

    private List<T> items;

    public Box() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

//    GENERIC METHODS
//    generic method that adds item to the list

    public void addItem(T t){
        items.add(t);
    }
    public T getLatestItem(){
        return this.items.get(items.size() -1);
    }

    public double getTotalWeight(){
//        acces items list
        return this.items
//                get stream of items
                .stream()
//                map every stream to a double
//                method reference concept
                .mapToDouble(Boxable::getWeight)
//                sum all the weights and return it as a double value
                .sum();
    }

    @Override
    public String toString() {
        return "Box{" +
                "items=" + items +
                '}';
    }
}