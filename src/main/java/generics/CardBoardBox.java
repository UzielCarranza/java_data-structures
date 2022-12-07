package generics;


//when you extend from a generic superclass, the subclass has to specify the type parameter of the hierarchy
//means it has to specify the type parameters that were already defined on the superclass Box

//this creates inheritance relationship
public class CardBoardBox<T extends Boxable> extends Box<T>{

    @Override
    public double getTotalWeight() {
        return super.getTotalWeight() + 0.01;
    }
}
