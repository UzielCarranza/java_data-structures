package generics;

public class TestBoxGenerics {
    public static void main(String[] args) {

//        invoke box generic type
//        book replaces T parameter
        Box<Book> bookBox = new Box<>();
        System.out.println(bookBox);

        Box<Fruit> fruitBox = new Box<>();
        System.out.println(fruitBox);

//        testing generic methods
        bookBox.addItem(new Book("Harry Potter", "JK Pauling", 0.5));
        bookBox.addItem(new Book("Deep Work", "Cal Newport", 0.25));
        System.out.println(bookBox.getLatestItem());
        fruitBox.addItem(new Fruit("Mango","India","Yellow",0.5));
        fruitBox.addItem(new Fruit("banana","Brazil","Green",0.3));
        System.out.println(fruitBox.getLatestItem());

        System.out.println();
        System.out.println("Book Count");
        System.out.println(BoxUtils.getCountOfItems(bookBox));
        System.out.println();
        System.out.println("Fruit Count");
        System.out.println(BoxUtils.getCountOfItems(fruitBox));
    }
}
