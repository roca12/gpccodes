import java.util.Arrays;
import java.util.Iterator;

//COUNT_SORT
public class Ordenamientos2_4 {

	static void countSort(char arr[]) {
		int n = arr.length;
		char output [] = new char [n];
		int count [] = new int [256];
		//tamaño de 256 caracteres que hay en ASCII extendido
		Arrays.fill(count, 0);
		//Llena el vector de ceros
		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
		}
		for (int i = 1; i <= 255; i++) {
			count[i] += count[i-1];
		}
		for (int i = n-1; i >= 0; i--) {
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		for (int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		char arr[] = {'g', 'e', 'e', 'k', 'l', 'i', 'B', 'g', 'a', 'x', 
				'f', 'A', '@', '*'};
		countSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
