// java code to find the number of ordered  
// trees with given number of edges and 
// leaves 

public class CombinatoricsOnOrderedTrees {

    // Function returns value of 
    // Binomial Coefficient C(n, k) 
    static int binomialCoeff(int n, int k) {
        int[][] C = new int[n + 1][k + 1];
        int i, j;
        // Calculate value of Binomial 
        // Coefficient in bottom up manner 
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= Math.min(i, k); j++) {
                // Base Cases 
                if (j == 0 || j == i) {
                    C[i][j] = 1;
                } // Calculate value using 
                // previously stored values 
                else {
                    C[i][j] = C[i - 1][j - 1]
                            + C[i - 1][j];
                }
            }
        }
        return C[n][k];
    }

    // Function to calculate the number 
    // of trees with exactly k leaves. 
    static int k_Leaves(int n, int k) {
        int ans = (binomialCoeff(n, k)
                * binomialCoeff(n, k - 1)) / n;
        System.out.println("Number of trees "
                + "having 4 edges and exactly 2 "
                + "leaves : " + ans);
        return 0;
    }

    // Function to calculate total number of 
    // nodes of degree d in these trees. 
    static int numberOfNodes(int n, int d) {
        int ans = binomialCoeff(2 * n - 1 - d,
                n - 1);
        System.out.println("Number of nodes "
                + "of degree 1 in a tree having 4 "
                + "edges : " + ans);
        return 0;
    }

    // Function to calculate the number of 
    // trees in which the root has degree r. 
    static int rootDegreeR(int n, int r) {
        int ans = r * binomialCoeff(2 * n
                - 1 - r, n - 1);
        ans = ans / n;
        System.out.println("Number of trees "
                + "having 4 edges where root has"
                + " degree 2 : " + ans);
        return 0;
    }

    // Driver program to test above functions 
    public static void main(String[] args) {
        // Number of trees having 3 
        // edges and exactly 2 leaves 
        k_Leaves(3, 2);
        // Number of nodes of degree 
        // 3 in a tree having 4 edges 
        numberOfNodes(3, 1);
        // Number of trees having 3 
        // edges where root has degree 2 
        rootDegreeR(3, 2);
    }
}  
