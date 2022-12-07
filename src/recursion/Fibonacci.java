package recursion;

import java.util.*;

/**
 * Fibonacci sequence is a sequence where the number n is sum of n-1 and n-2 and sequence starts from 0 and 1
 * This will only print the nth number in fibonacci sequence.
 */
public class Fibonacci {

    static HashMap<Integer, Integer> map = new HashMap<>();
    public static void main( String args[] ) {
        int n = 10;
        /*fibonacci(n);
        System.out.println(map.size());
        for(int i: map.values()) {
            System.out.println(i);
        }*/

        for(int i = 0; i < n; i++ ) {
            int fibNum = fibonacciDP(i);
            System.out.print(fibNum + " " );
        }
    }

    // 2^n time complexity and o(n) space complexity
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
        if(map.get(n) == null)
        {
            map.put(n, fibNum);
        }
        return fibNum;
    }

    private static int fibonacciDP(int n) {

        int f[] = new int[n + 2];

        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i <= n; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        return f[n];
    }
}
