
// Given two integers a and b. The task is to print 
// sum of all the digits appearing in the 
// integers between a and b 
import java.util.ArrayList;

public class DigitDP {

    // Memoization for the state results 
    static long dp[][][] = new long[20][180][2];
    static ArrayList<Long> digitA = new ArrayList<>();
    static ArrayList<Long> digitB = new ArrayList<>();

    // Stores the digits in x in a vector digit 
    static ArrayList<Long> getDigits(long x) {
        ArrayList<Long> digit=new ArrayList<>();
        while (x != 0) {
            digit.add(x % 10);
            x /= 10;
        }
        return digit;
    }

    // Return sum of digits from 1 to integer in 
    // digit vector 
    static long digitSum(int idx, int sum, int tight, ArrayList<Long> digit) {
        // base case 
        if (idx == -1) {
            return sum;
        }
        // checking if already calculated this state 
        if (dp[idx][sum][tight] != -1 && tight != 1) {
            return dp[idx][sum][tight];
        }
        long ret = 0;
        // calculating range value 
        long k = (tight > 0) ? digit.get(idx) : 9;
        for (int i = 0; i <= k; i++) {
            // caclulating newTight value for next state 
            int newTight = (digit.get(idx) == i) ? tight : 0;
            // fetching answer from next state 
            ret += digitSum(idx - 1, sum + i, newTight, digit);
        }
        if (tight == 0) {
            dp[idx][sum][tight] = ret;
        }
        return ret;
        // Returns sum of digits in numbers from a to b. 
    }

    static long rangeDigitSum(long a, long b) {
        // initializing dp with -1
        for (long[][] dp1 : dp) {
            for (long[] dp11 : dp1) {
                for (int k = 0; k < dp11.length; k++) {
                    dp11[k] = -1;
                }
            }
        }
        // storing digits of a-1 in digit vector 
        digitA=getDigits(a - 1);
        // Finding sum of digits from 1 to "a-1" which is passed 
        // as digitA. 
        long ans1 = digitSum(digitA.size() - 1, 0, 1, digitA);
        // Storing digits of b in digit vector 

        digitB=getDigits(b);
        // Finding sum of digits from 1 to "b" which is passed 
        // as digitB. 
        long ans2 = digitSum(digitB.size() - 1, 0, 1, digitB);
        return (ans2 - ans1);
    }

    public static void main(String[] args) {
        long a = 10, b = 20;
        System.out.println("digit sum for given range : "
                + rangeDigitSum(a, b));
    }
}
