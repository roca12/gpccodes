
import java.util.*;

public class UniqueSubsequencesklength {

// Function which returns the numbe of
// unique subsequences of length K
    static int solution(int[] A, int N, int k) {

        // Bases cases
        if (N < k || N < 1 || k < 1) {
            return 0;
        }
        if (N == k) {
            return 1;
        }

        // Prepare arrays for recursion
        int[] v1 = new int[N];
        int[] v2 = new int[N];
        int[] v3 = new int[N];

        // Initiate separately for k = 1
        // intiate the last element
        v2[N - 1] = 1;
        v3[A[N - 1] - 1] = 1;

        // Initiate all other elements of k = 1
        for (int i = N - 2; i >= 0; i--) {

            // Initialize the front element
            // to vector v2
            v2[i] = v2[i + 1];

            // If element v[a[i]-1] is 0
            // then increment it in vector v2
            if (v3[A[i] - 1] == 0) {
                v2[i]++;
                v3[A[i] - 1] = 1;
            }
        }

        // Iterate for all possible values of K
        for (int j = 1; j < k; j++) {

            // Fill the vectors with 0
            Arrays.fill(v3, 0);

            // Fill(v1.begin(), v1.end(), 0)
            // the last must be 0 as from last
            // no unique subarray can be formed
            v1[N - 1] = 0;

            // Iterate for all index from which 
            // unique subsequences can be formed
            for (int i = N - 2; i >= 0; i--) {

                // Add the number of subsequence 
                // formed from the next index
                v1[i] = v1[i + 1];

                // Start with combinations on the
                // next index
                v1[i] = v1[i] + v2[i + 1];

                // Remove the elements which have
                // already been counted
                v1[i] = v1[i] - v3[A[i] - 1];

                // Update the number used
                v3[A[i] - 1] = v2[i + 1];
            }
        }

        // Last answer is stored in v2
        return v2[0];
    }

// Driver Code
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int n = a.length;
        int k = 3;

        System.out.print(solution(a, n, k));
    }
}
