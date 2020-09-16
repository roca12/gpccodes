import java.util.ArrayList;
import java.util.Arrays;

public class Exponential_Search {

	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		int numerobuscado = 1;
		Integer arr[] = new Integer [lista.size()];
		int resultado = exponentialSearch(lista.toArray(arr) ,lista.size(), numerobuscado);
		System.out.println(resultado < 0 ? "El elemento no esta presente en el array" : 
			"El elemento esta en la posicion: "+resultado);
	}
	
	static int exponentialSearch(Integer [] arr, int n, int x) {
		if(arr [0] == x) {
			return 0;
		}
		int i = 1;
		while(i<n&&arr[i]<=x) {
			i = i*2;
		}
			return Arrays.binarySearch(arr,i/2,Math.min(i, n), x);
	}
}
