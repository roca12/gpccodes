import java.util.Arrays;
//BINARY INSERTION SORT
public class Ordenamientos_3 {
	
	static void binaryInsertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			int j = Math.abs(Arrays.binarySearch(arr, 0, i, x) + 1);
			System.arraycopy(arr, j, arr, j+1, i-j);
			arr[j] = x;
			
		}
	}

	public static void main(String[] args) {
		int arr[] = {37, 23, 0, 17, 12, 72, 90};
		binaryInsertionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}


	}

}
