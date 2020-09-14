// Java program to find maximum sum increasing 
// subsequence tiint i-th index and including 
// k-th index. 

public class MaximumSumIncreasingSubsequenceFromPrefix {

    static int pre_compute(int a[], int n,
            int index, int k) {
        int dp[][] = new int[n][n];

        // Initializing the first row of 
        // the dp[][]. 
        for (int i = 0; i < n; i++) {
            if (a[i] > a[0]) {
                dp[0][i] = a[i] + a[0];
            } else {
                dp[0][i] = a[i];
            }
        }

        // Creating the dp[][] matrix. 
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] > a[i] && j > i) {
                    if (dp[i - 1][i] + a[j]
                            > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][i]
                                + a[j];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        // To calculate for i=4 and k=6. 
        return dp[index][k];
    }

    // Driver code 
    public static void main(String[] args) {
        int a[] = {1, 101, 2, 3, 100, 4, 5};
        int n = a.length;
        int index = 4, k = 6;
        System.out.println(
                pre_compute(a, n, index, k));
    }
}
