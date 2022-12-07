package generics;

public class TestGenericHierarchy {
    public static void main(String[] args) {

//        we have an object of generic type
        CardBoardBox<Fruit> cardBoardBox = new CardBoardBox<>();
        Box<Fruit> fruitBox = new Box<>();

//        we assign the cardboard variable to the fruit box variable
//        this is casting in generic type hierarchy
        fruitBox = cardBoardBox;
    }
}
