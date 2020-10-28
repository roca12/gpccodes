import java.util.ArrayList;
import java.util.Arrays;

//Criba de Eratósteles
public class Main {
	
	static final int MAXSIZE = 1000001;
	
	static ArrayList<Boolean> isprime = new ArrayList<>(MAXSIZE);
	
	static ArrayList<Integer> prime = new ArrayList<>();
	
	static ArrayList<Integer> SPF = new ArrayList<>(MAXSIZE);
	
	static void manipulateSieve(int N) {
		isprime.set(0, false);//El 0 no es primo
		isprime.set(1, false);//El 1 no es primo
		for (int i = 2; i < N; i++) {
			if(isprime.get(i)) { //Si es primo lo añade a la lista de primos
				prime.add(i);
				SPF.set(i, i);
			}
			for (int j = 0; j < prime.size() && i+prime.get(j) < N && prime.get(j) <= SPF.get(i); j++) {
				isprime.set(i*prime.get(j), false);//Quita los múltiplos
				SPF.set(i*prime.get(j), prime.get(j));
			}
		}	
	}

	public static void main(String[] args) {
	
		int n = 19;
		for (int i = 0; i < MAXSIZE; i++) {
			isprime.add(true);
			SPF.add(2);
		}
		manipulateSieve(n);
		for (int i = 0; i < prime.size() && prime.get(i)<= n; i++) {
			System.out.println(prime.get(i) + " ");
		}
		System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(isprime.get(i)+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(SPF.get(i)+" ");
        }
	}
}
