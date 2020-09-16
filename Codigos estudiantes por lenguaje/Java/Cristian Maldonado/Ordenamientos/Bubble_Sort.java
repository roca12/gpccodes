import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bubble_Sort {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String entrada [] = br.readLine().split(" ");
		int arr[] = new int[entrada.length];
		for (int i = 0; i < entrada.length; i++) {
			arr[i] = Integer.parseInt(entrada[i]);
		}
		bubbleSort(arr, arr.length);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	static void bubbleSort(int arr[], int size) {
		if (size == 1)
			return;
		for (int i = 0; i < size ; i++) {
			for (int j = 0; j < size-1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}				
			}
		}
	}
}
