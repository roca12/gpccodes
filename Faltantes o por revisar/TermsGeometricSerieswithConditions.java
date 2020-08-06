// Java program to find number of terms 
// in Geometric Series 

import java.util.*;

public class TermsGeometricSerieswithConditions {

    // A map to keep track of the bad integers 
    static HashMap<Integer, Boolean> map = new HashMap<>();

    // Function to calculate No. of elements 
    // in our series 
    static void progression(int b1, int q, int l,
            int m, int[] bad) {

        // Updating value of our map 
        for (int i = 0; i < m; i++) {
            map.put(bad[i], true);
        }

        // if starting value is greate 
        // r than our given limit 
        if (Math.abs(b1) > l) {
            System.out.print("0");
        } // if q or starting value is 0 
        else if (q == 0 || b1 == 0) {

            // if 0 is not a bad integer, 
            // answer becomes inf 
            if (!map.containsKey(0)) {
                System.out.print("inf");
            } // if q is 0 and b1 is not and b1 
            // is not a bad integer, answer becomes 1 
            else if (map.get(0) == true && !map.containsKey(b1)) {
                System.out.print("1");
            } // else if 0 is bad integer and 
            // b1 is also a bad integer, 
            // answer becomes 0 
            else {
                System.out.print("0");
            }
        } // if q is 1 
        else if (q == 1) {

            // and b1 is not a bad integer, 
            // answer becomes inf 
            if (!map.containsKey(b1)) {
                System.out.print("inf");
            } // else answer is 0 
            else {
                System.out.print("0");
            }

        } // if q is -1 
        else if (q == -1) {

            // and either b1 or -b1 is not 
            // present answer becomes inf 
            if (!map.containsKey(b1) || !map.containsKey(-1 * b1)) {
                System.out.print("inf");
            } // else answer becomes 0 
            else {
                System.out.print("0");
            }

        } // if none of the above case is true, 
        // simpy calculate the number of 
        // elements in our series 
        else {
            int co = 0;
            while (Math.abs(b1) <= l) {
                if (!map.containsKey(b1)) {
                    co++;
                }
                b1 *= q;
            }
            System.out.print(co);
        }
    }

    // Driver Code 
    public static void main(String[] args) {
        // starting value of series, 
        // number to be multiplied, 
        // limit within which our series, 
        // No. of bad integers given 
        int b1 = 3, q = 2, l = 30, m = 4;

        // Bad integers 
        int[] bad = {6, 14, 25, 48};

        progression(b1, q, l, m, bad);
    }
}
