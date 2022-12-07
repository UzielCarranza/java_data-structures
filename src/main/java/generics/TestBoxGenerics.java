package generics;

public class TestBoxGenerics {
    public static void main(String[] args) {

//        invoke box generic type
//        book replaces T parameter
        Box<Book> bookBox = new Box<>();
        System.out.println(bookBox);

        Box<Fruit> fruitBox = new Box<>();
        System.out.println(fruitBox);
    }
}
