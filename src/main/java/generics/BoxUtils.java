package generics;

public class BoxUtils {
//    Outside of generic class

//    note... T is not the return type. It is of int type
    public static  <T extends Boxable> int getCountOfItems(Box<T> box){
        return box.getItems().size();

    }
}
