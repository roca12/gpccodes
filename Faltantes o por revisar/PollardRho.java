
import java.util.Random;

//La función Rho de Pollard calcula un divisor no trivial de n. 

public class PollardRho {

    public static long rho(long n) {
        if ((n & 1) == 0) {
            return 2;
        }
        long i = 0, k = 2, x = 3, y = 3, d;
        while (true) {
            x = (modmul(x, x, n) + n - 1) % n;
            d = gcd(Math.abs(y - x), n);
            if (d != 1 && d != n) {
                return d;
            }
            if (++i == k) {
                y = x;
                k <<= 1;
            }
        }
    }

    public static long gcd(long a, long b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static long modmul(long a, long b, long mod) {
        long x = 0;
        long y = a % mod;
        while (b > 0) {
            if (b % 2 == 1) {
                x = (x + y) % mod;
            }
            y = (y << 1) % mod;
            b >>= 1;
        }
        return x % mod;
    }
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(rho(r.nextInt(10)));
        }
    }
    
}
