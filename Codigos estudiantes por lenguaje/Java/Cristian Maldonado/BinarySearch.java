import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int arr[]= {1,2,3,4,5,6};
		int tam = arr.length;
		int numerobuscado = 5;
		int resultado = binarySearch(arr, 0, tam-1, numerobuscado);
		if(resultado == -1) {
			System.out.println("Elemento no encontrado");
		}else {
			System.out.println("Elemento encontrado en el indice "+resultado);
		}
	}
	
	static int binarySearch(int arr[],int inicio, int tamfinal, int numerobuscado) {
		if(tamfinal>=inicio) {
			int medio = inicio+(tamfinal-1)/2; 
			if(arr[medio]== numerobuscado) {
				return medio;
			}
			if(arr[medio]>numerobuscado) {
				return binarySearch(arr, inicio, medio-1, numerobuscado);
			}else {
				return binarySearch(arr, medio+1, tamfinal, numerobuscado);
			}
		}
		return -1;
	}

}
