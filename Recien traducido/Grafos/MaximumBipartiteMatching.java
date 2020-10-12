// A Java program to find maximal 
// Bipartite matching. 

public class MaximumBipartiteMatching {

    // M is number of applicants 
    // and N is number of jobs 
    static final int M = 6;
    static final int N = 6;

    // A DFS based recursive function that  
    // returns true if a matching for  
    // vertex u is possible 
    static boolean bpm(boolean bpGraph[][], int u,
            boolean seen[], int matchR[]) {
        // Try every job one by one 
        for (int v = 0; v < N; v++) {
            // If applicant u is interested  
            // in job v and v is not visited 
            if (bpGraph[u][v] && !seen[v]) {

                // Mark v as visited 
                seen[v] = true;

                // If job 'v' is not assigned to 
                // an applicant OR previously 
                // assigned applicant for job v (which 
                // is matchR[v]) has an alternate job available. 
                // Since v is marked as visited in the  
                // above line, matchR[v] in the following 
                // recursive call will not get job 'v' again 
                if (matchR[v] < 0 || bpm(bpGraph, matchR[v],
                        seen, matchR)) {
                    matchR[v] = u;
                    return true;
                }
            }
        }
        return false;
    }

    // Returns maximum number  
    // of matching from M to N 
    static int maxBPM(boolean bpGraph[][]) {
        // An array to keep track of the  
        // applicants assigned to jobs.  
        // The value of matchR[i] is the  
        // applicant number assigned to job i,  
        // the value -1 indicates nobody is assigned. 
        int matchR[] = new int[N];

        // Initially all jobs are available 
        for (int i = 0; i < N; ++i) {
            matchR[i] = -1;
        }

        // Count of jobs assigned to applicants 
        int result = 0;
        for (int u = 0; u < M; u++) {
            // Mark all jobs as not seen  
            // for next applicant. 
            boolean seen[] = new boolean[N];
            for (int i = 0; i < N; ++i) {
                seen[i] = false;
            }

            // Find if the applicant 'u' can get a job 
            if (bpm(bpGraph, u, seen, matchR)) {
                result++;
            }
        }
        return result;
    }

    // Driver Code 
    public static void main(String[] args)
            throws java.lang.Exception {
        // Let us create a bpGraph shown 
        // in the above example 
        boolean bpGraph[][] = new boolean[][]{
            {false, true, true,
                false, false, false},
            {true, false, false,
                true, false, false},
            {false, false, true,
                false, false, false},
            {false, false, true,
                true, false, false},
            {false, false, false,
                false, false, false},
            {false, false, false,
                false, false, true}};
        System.out.println("Maximum number of applicants that can"
                + " get job is " + maxBPM(bpGraph));
    }
}
