import java.util.Random;

public class Main {

	static int RUN = 32;

	public static void insertionSort(int[] arr, int left, int right) {
		for (int i = left + 1; i <= right; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= left && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	static void merge(int arr[], int l, int m, int r) {
   
        int n1 = m - l + 1;
        int n2 = r - m;
       
        int L[] = new int[n1];
        int R[] = new int[n2];
      
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

	public static void timSort(int[] arr, int n) {

		for (int i = 0; i < n; i += RUN) {
			insertionSort(arr, i, Math.min((i + 31), (n - 1)));
		}
		for (int size = RUN; size < n; size = 2 * size) {
			for (int left = 0; left < n; left += 2 * size) {
				int mid = Math.min((left + size - 1), (n - 1));
				int right = Math.min((left + 2 * size - 1), (n - 1));
				merge(arr, left, mid, right);
			}
		}
	}

	public static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}


	public static void main(String[] args) {
		int[] arr = new int[2000];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(1000);
		}
		int n = arr.length;
		System.out.print("Given Array is\n");
		printArray(arr, n);
		timSort(arr, n);
		System.out.print("After Sorting Array is\n");
		printArray(arr, n);
	}
}

