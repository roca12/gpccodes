// Java program to print primes smaller 
// than n using Sieve of Sundaram. 

import java.util.Arrays;

public class SieveSundaram {

// Prints all prime numbers smaller 
    static int SieveOfSundaram(int n) {

        // In general Sieve of Sundaram, produces  
        // primes smaller than (2*x + 2) for a number 
        // given number x. Since we want primes  
        // smaller than n, we reduce n to half 
        int nNew = (n - 1) / 2;

        // This array is used to separate numbers of the  
        // form i+j+2ij from others where 1 <= i <= j 
        boolean marked[] = new boolean[nNew + 1];

        // Initialize all elements as not marked 
        Arrays.fill(marked, false);

        // Main logic of Sundaram. Mark all numbers of the 
        // form i + j + 2ij as true where 1 <= i <= j 
        for (int i = 1; i <= nNew; i++) {
            for (int j = i; (i + j + 2 * i * j) <= nNew; j++) {
                marked[i + j + 2 * i * j] = true;
            }
        }

        // Since 2 is a prime number 
        if (n > 2) {
            System.out.print(2 + " ");
        }

        // Print other primes. Remaining primes are of  
        // the form 2*i + 1 such that marked[i] is false. 
        for (int i = 1; i <= nNew; i++) {
            if (marked[i] == false) {
                System.out.print(2 * i + 1 + " ");
            }
        }
        return -1;
    }

// Driver code 
    public static void main(String[] args) {
        int n = 20;
        SieveOfSundaram(n);
    }
}
