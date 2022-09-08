package Algorithms;

public class findMaximum {
    public static int findMaximum(int a, int b, int c) {
        if (a > b) {
            if (a > c || a == c) {
                return a;
            }
        }
        if (b > c) {
            return b;
        }
        return c;
    }


    //    new implementation only does 2 comparisons per call
    public static int findMaximumOptimize(int a, int b, int c) {
        int max = a;

//        at this point, max contains the maximum of A and B
        if (b > max) {
            max = b;
        }
//        assign maximum value to if c is greather than A and B
        if (c > max) {
            max = c;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(findMaximum(1, 22, 3));
        System.out.println(findMaximumOptimize(1,22,3));
    }
}
