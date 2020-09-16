
import java.util.ArrayList;

public class Sieve_Of_Eratosthenes_Optimized {

    static final int MAX_SIZE = 1000001;
    static ArrayList<Boolean> isPrime = new ArrayList<>(MAX_SIZE);
    static ArrayList<Integer> prime = new ArrayList<>();
    static ArrayList<Integer> SPF = new ArrayList<>(MAX_SIZE);

    static void manipuledSieve(int N) {
        isPrime.set(0, false);
        isPrime.set(1, false);
        for (int i = 2; i < N; i++) {
            if (isPrime.get(i)) {
                prime.add(i);
                SPF.set(i, i);
            }
            for (int j = 0; j < prime.size() && i * prime.get(j) < N && prime.get(j) <= SPF.get(i); j++) {
                isPrime.set(i * prime.get(j), false);
                SPF.set(i * prime.get(j), prime.get(j));
            }
        }
    }

    public static void main(String[] args) {
        int N = 29;
        for (int i = 0; i < MAX_SIZE; i++) {
            isPrime.add(true);
            SPF.add(2);
        }
        manipuledSieve(N + 1);
        System.out.println("Numeros primos desde 2 hasta " + N + ":");
        for (int i = 0; i < prime.size(); i++) {
            System.out.print(prime.get(i) + " ");
        }
        System.out.println("");
        System.out.println("Factores primos de cada numero:");
        for (int i = 2; i <= N; i++) {
            System.out.println(i + ":" + SPF.get(i));
        }
    }
}
