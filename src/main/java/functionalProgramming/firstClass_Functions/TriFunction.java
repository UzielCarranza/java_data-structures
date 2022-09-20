package functionalProgramming.firstClass_Functions;

//example of creating a function that takes 3 arguments
public interface TriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}
