
import java.util.Arrays;

public class Busquedas2 {
	//BUSQUEDA EXPONENCIAL
	
	static int expSearch(int arr[], int n, int x) {
		if (arr[0] == x) {
			return 0;
		}
		
		int i = 1;
		while (i<n && arr[i] <= x) {
			i = i * 2;
		}
		return Arrays.binarySearch(arr, i/2, Math.min(i,n), x);
		
	}

	public static void main(String[] args) {
		int arr[] = {2,3,4,10,40};
		int x = 2;
		int result = expSearch(arr, arr.length, x);
		if (result < 0) {
			System.out.println("No se encontro");
		}else {
			System.out.println("Dato encontrado en: " + result);
		}

	}

}
