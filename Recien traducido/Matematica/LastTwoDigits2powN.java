// Java code to find last 
// 2 digits of 2^n 

public class LastTwoDigits2powN {

    /* Iterative Function to 
calculate (x^y)%p in O(log y) */
    static int power(long x, long y,
            long p) {
        int res = 1; // Initialize result 

        x = x % p; // Update x if it is more 
        // than or equal to p 

        while (y > 0) {

            // If y is odd, multiply 
            // x with result 
            long r = y & 1;

            if (r == 1) {
                res = (res * (int) x) % (int) p;
            }

            // y must be even now 
            y = y >> 1; // y = y/2 
            x = (x * x) % p;
        }
        return res;
    }

// Java function to calculate 
// number of digits in x 
    static int numberOfDigits(int x) {
        int i = 0;
        while (x != 0) {
            x /= 10;
            i++;
        }
        return i;
    }

// Java function to print 
// last 2 digits of 2^n 
    static void LastTwoDigit(int n) {
        System.out.print("Last " + 2
                + " digits of " + 2 + "^");
        System.out.print(n + " = ");

// Generating 10^2 
        int temp = 1;
        for (int i = 1; i <= 2; i++) {
            temp *= 10;
        }

// Calling modular exponentiation 
        temp = power(2, n, temp);

// Printing leftmost zeros. 
// Since (2^n)%2 can have digits 
// less then 2. In that case 
// we need to print zeros 
        for (int i = 0;
                i < (2 - numberOfDigits(temp)); i++) {
            System.out.print(0 + " ");
        }

// If temp is not zero then 
// print temp. If temp is zero 
// then already printed 
        if (temp != 0) {
            System.out.println(temp);
        }
    }

// Driver Code 
    public static void main(String[] args) {
        int n = 72;
        LastTwoDigit(n);
    }
}
