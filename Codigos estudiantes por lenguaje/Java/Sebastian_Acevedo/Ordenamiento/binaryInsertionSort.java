package programming;

import java.util.Arrays;

public class Main{
	
	static void binaryInsertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int x = arr[i];
			int j = Math.abs(Arrays.binarySearch(arr, 0, 1, x)+1);
			arr[j] = x;
			System.arraycopy(arr, j, arr, j+1, i-j);
			arr[j] = x;
		}
	}

    public static void main(String[] args) {
      
       int arr[] = {64, 34,25,12,22,11,90};
       binaryInsertionSort(arr);
       for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
    }
}
