package recursion;

import java.util.*;

/**
 * Fibonacci sequence is a sequence where the number n is sum of n-1 and n-2 and sequence starts from 0 and 1
 * This will only print the nth number in fibonacci sequence.
 */
public class Fibonacci {

    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main( String args[] ) {
        int n = 9;
        fibonacci(n);
        System.out.println(map.size());
        for(int i: map.values()) {
            System.out.println(i);
        }
    }

    private static int fibonacci(int n) {
        if(n < 0) {
            return -1;
        }
        if(n == 0) {
            map.put(0, 0);
            return 0;
        }
        if(n == 1 ||  n == 2) {
            map.put(1, 1);
            map.put(1, 1);
            return 1;
        }
        int fibNum = fibonacci(n -1) + fibonacci(n-2) ;
       // System.out.println("n is " + n + " " + " fibNum is " + fibNum);
        if(map.get(n) == null)
        {
            map.put(n, fibNum);
         //   System.out.println("Am here");
        }
        return fibNum;
    }
}
