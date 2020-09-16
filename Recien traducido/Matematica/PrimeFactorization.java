//Guarda en factors la lista de factores primos de n de menor a 
//mayor. IMPORTANTE: Debe ejecutarse primero Sieve of Eratosthenes 
//(al menos hasta un numero mayor a la raiz cuadrada de n).

import java.util.ArrayList;

public class PrimeFactorization {
    static int MAX = 1000000;
    static int SQRT = 1000;
    static ArrayList<Integer> primes = new ArrayList<>();
    static boolean marked[] = new boolean[MAX + 1];
    static ArrayList<Integer> factors = new ArrayList<>();

    public static void primeFactors(int n) {
        factors.clear();
        for (int i = 0, p = primes.get(i); p * p <= n; p = primes.get(++i)) {
            while (n % p == 0) {
                factors.add(p);
                n /= p;
            }
        }
        if (n > 1) {
            factors.add(n);
        }
    }
    
    static void sieve() {
        marked[1] = true;
        int i = 2;
        for (; i <= SQRT; ++i) {
            if (!marked[i]) {
                primes.add(i);
                for (int j = i * i; j <= MAX; j += i) {
                    marked[j] = true;
                }
            }
        }
        for (; i <= MAX; ++i) {
            if (!marked[i]) {
                primes.add(i);
            }
        }
    }
    public static void main(String[] args) {
        sieve();
        primeFactors(100);
        for (Integer i : factors) {
            System.out.print(i+" ");
        }
        System.out.println("");
    }
}
