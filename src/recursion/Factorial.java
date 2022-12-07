package recursion;

/**
 * Factorial of a number n is product of all the numbers less than n and n.
 */
public class Factorial {

    public static void main( String args[] ) {
        int number = 3;
        System.out.println(factorial(number));
    }

    private static int factorial(int n) {
        // check for negative numbers
        if( n < 0 ) {
            return -1;
        }
        if( n == 0 || n == 1 ) {
            return 1;
        }
        int result = n * factorial(n - 1);
        return result;
    }
}
