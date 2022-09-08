package Algorithms;

public class findMaximum {
    public static int findMaximum(int a, int b, int c){
        if (a > b){
            if (a > c || a == c){
                return a;
            }
        }
        if (b > c){
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(findMaximum(1,22,3));
    }
}
