// Java program to calculate discrete logarithm 

public class DiscreteLogarithm {

    /* Iterative Function to calculate (x ^ y)%p in 
        O(log y) */
    static int powmod(int x, int y, int p) {
        int res = 1; // Initialize result 

        x = x % p; // Update x if it is more than or 
        // equal to p 

        while (y > 0) {
            // If y is odd, multiply x with result 
            if ((y & 1) > 0) {
                res = (res * x) % p;
            }

            // y must be even now 
            y = y >> 1; // y = y/2 
            x = (x * x) % p;
        }
        return res;
    }

// Function to calculate k for given a, b, m 
    static int discreteLogarithm(int a, int b, int m) {

        int n = (int) (Math.sqrt(m) + 1);

        int[] value = new int[m];

        // Store all values of a^(n*i) of LHS 
        for (int i = n; i >= 1; --i) {
            value[powmod(a, i * n, m)] = i;
        }

        for (int j = 0; j < n; ++j) {
            // Calculate (a ^ j) * b and check 
            // for collision 
            int cur = (powmod(a, j, m) * b) % m;

            // If collision occurs i.e., LHS = RHS 
            if (value[cur] > 0) {
                int ans = value[cur] * n - j;
                // Check whether ans lies below m or not 
                if (ans < m) {
                    return ans;
                }
            }
        }
        return -1;
    }

    // Driver code 
    public static void main(String[] args) {
        int a = 2, b = 3, m = 5;
        System.out.println(discreteLogarithm(a, b, m));

        a = 3;
        b = 7;
        m = 11;
        System.out.println(discreteLogarithm(a, b, m));
    }
} 
