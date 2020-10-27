import java.util.Arrays;

//Criba de Eratósteles
public class Main {
	
	static boolean[] sieveEra(int N) {
		boolean[] prime = new boolean[N+1];
		Arrays.fill(prime,true);
		prime[0] = prime[1] = false;
		//0 y 1 no son primos
		for (int p = 2; p*p < N; p++) {
			if(prime[p]) {
			for (int i = p*p; i <= N; i+=p) {
				prime[i]=false;
				//Elimina todos los múltiplos del primer 
				//primo que encuentre.
			}
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		int num = 12;
		boolean[] res = sieveEra(num);
		//Mira si los números son primos desde el 0 a 200
		for (int i = 0; i < res.length; i++) {
			System.out.println(i + " is " + res[i]);
		}
		
	}
}
