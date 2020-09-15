// Java program to count Minimum number 
// of swaps so that the largest element 
// is at beginning and the 
// smallest element is at last 

import java.io.*;

public class MinimumAdjacentSwapsMaxMinCorners {
    // Function performing calculations 

    public static void minimumSwaps(int a[], int n) {
        int maxx = -1, minn = a[0], l = 0, r = 0;
        for (int i = 0; i < n; i++) {

            // Index of leftmost largest element 
            if (a[i] > maxx) {
                maxx = a[i];
                l = i;
            }

            // Index of rightmost smallest element 
            if (a[i] <= minn) {
                minn = a[i];
                r = i;
            }
        }
        if (r < l) {
            System.out.println(l + (n - r - 2));
        } else {
            System.out.println(l + (n - r - 1));
        }
    }

    // Driver Code 
    public static void main(String args[]) throws IOException {
        int a[] = {5, 6, 1, 3};
        int n = a.length;
        minimumSwaps(a, n);
    }
}
