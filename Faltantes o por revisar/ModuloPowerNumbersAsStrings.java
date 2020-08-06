// Java program to find (a^b) % MOD 
// where a and b may be very large 
// and represented as strings. 

import java.util.*;

public class ModuloPowerNumbersAsStrings {

    static long MOD = (long) (1e9 + 7);

    // Returns modulo exponentiation for two numbers 
    // represented as long long int. It is used by 
    // powerStrings(). Its complexity is log(n) 
    static long powerLL(long x, long n) {
        long result = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                result = result * x % MOD;
            }
            n = n / 2;
            x = x * x % MOD;
        }
        return result;
    }

    // Returns modulo exponentiation for 
    // two numbers represented as strings. 
    // It is used by powerStrings() 
    static long powerStrings(String sa, String sb) {
        // We convert strings to number 
        long a = 0, b = 0;

        // calculating a % MOD 
        for (int i = 0; i < sa.length(); i++) {
            a = (a * 10 + (sa.charAt(i) - '0'))
                    % MOD;
        }

        // calculating b % (MOD - 1) 
        for (int i = 0; i < sb.length(); i++) {
            b = (b * 10 + (sb.charAt(i) - '0'))
                    % (MOD - 1);
        }

        // Now a and b are long long int. We 
        // calculate a^b using modulo exponentiation 
        return powerLL(a, b);
    }

    // Driver code 
    public static void main(String[] args) {

        // As numbers are very large 
        // that is it may contains upto 
        // 10^6 digits. So, we use string. 
        String sa = "2", sb = "3";
        System.out.println(powerStrings(sa, sb));
    }
}
