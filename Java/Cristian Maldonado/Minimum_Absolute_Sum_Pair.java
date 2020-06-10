
public class MaxMinSearch {

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 1, 330, 3000 };
		int n = arr.length;
		Pair minPair = getMinMax(arr, n);
		System.out.printf("El minimo elemento es %d", minPair.min);
		System.out.printf("\nEl maximo elemento es %d", minPair.max);
	}

	static class Pair {
		int min;
		int max;
	}

	static Pair getMinMax(int arr[], int n) {
		Pair minmax = new Pair();
		if (n == 1) {
			minmax.max = arr[0];
			minmax.min = arr[0];
		}
		if (arr[0] > arr[1]) {
			minmax.max = arr[0];
			minmax.min = arr[1];
		} else {
			minmax.max = arr[1];
			minmax.min = arr[0];
		}
		for (int j = 2; j < n; j++) {
			if (arr[j] > minmax.max) {
				minmax.max = arr[j];
			} else if (arr[j] < minmax.min) {
				minmax.min = arr[j];
			}
		}
		return minmax;
	}

}
