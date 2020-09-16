// Java implementation of the
// Polynomial Rolling Hash Function

public class PolynomialRollingHash {

    // Function to calculate
    // the hash of a String
    static long polynomialRollingHash(String str) {

        // P and M
        int p = 31;
        int m = (int) (1e9 + 9);
        long power_of_p = 1;
        long hash_val = 0;

        // Loop to calculate the hash value
        // by iterating over the elements of String
        for (int i = 0; i < str.length(); i++) {
            hash_val = (hash_val + (str.charAt(i)
                    - 'a' + 1) * power_of_p) % m;
            power_of_p = (power_of_p * p) % m;
        }
        return hash_val;
    }

// Driver Code
    public static void main(String[] args) {

        // Given Strings
        String str1 = "geeksforgeeks";
        String str2 = "geeks";

        System.out.print("Hash of '" + str1 + "' = "
                + polynomialRollingHash(str1));
    }
}

