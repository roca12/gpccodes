// Java Program to find Number of 
// ways to change the XOR of two 
// numbers by swapping the bits 

public class WaysToXORTwoNumbers {
// Function that returns the 
// number of bit swaps such 
// that xor is different 

    static int countWays(String s1,
            String s2) {
        int c1 = 0, c0 = 0;
        int n = s1.length();

        // traverse and count 1's and 0's 
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) == '1') {
                c1++;
            } else {
                c0++;
            }
        }
        int used1 = 0, used0 = 0;
        int ways = 0;

        // traverse in the String 
        for (int i = 0; i < n; i++) {

            // if both positions are 0 
            if (s1.charAt(i) == '0'
                    && s2.charAt(i) == '0') {

                // add the number of ones as 
                // it will change the XOR 
                ways += c1;

                // subtract the number of 
                // ones already used 
                ways -= used1;

                // zeros have been used 
                used0++;
            } // when 1 and 0, to change XOR, 
            // we have to replace 1 by 0 
            else if (s1.charAt(i) == '1'
                    && s2.charAt(i) == '0') {

                // add number of 0's 
                ways += c0;

                // subtract number of 
                // 0's already used 
                ways -= used0;

                // count 1's used 
                used1++;
            }
        }

        // return the answer 
        return ways;
    }

// Driver Code 
    public static void main(String[] args) {
        String s1 = "01011";
        String s2 = "11001";

        System.out.println(countWays(s1, s2));
    }
}
