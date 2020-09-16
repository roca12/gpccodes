import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    static final int MAX_SIZE = 1000001;
    static ArrayList<Boolean> isprime = new ArrayList<>(MAX_SIZE);
    static ArrayList<Integer> prime = new ArrayList<>();
    static ArrayList< Integer> SPF = new ArrayList<>(MAX_SIZE);

    static void manipuledSieve(int N) {
        isprime.set(0, false);
        isprime.set(1, false);
        for (int i = 2; i < N; i++) {
            if (isprime.get(i)) {
                prime.add(i);
                SPF.set(i, i);
            }
            for (int j = 0;
                    j < prime.size()
                    && i * prime.get(j) < N && prime.get(j) <= SPF.get(i);
                    j++) {
                isprime.set(i * prime.get(j), false);
                SPF.set(i * prime.get(j), prime.get(j));
            }
        }
    }

    public static void main(String[] args) {
        int N=10000;
        for (int i = 0; i < MAX_SIZE; i++) {
            isprime.add(true);
            SPF.add(2);
        }
        manipuledSieve(N);
        for (int i = 0; i <prime.size(); i++) {
            System.out.print(prime.get(i)+" ");
        }
    }
}
