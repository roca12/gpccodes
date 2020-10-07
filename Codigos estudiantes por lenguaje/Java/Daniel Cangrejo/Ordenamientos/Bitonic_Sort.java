//BITONIC_SORT
public class Ordenamientos2_1 {

	static void compAndSwap(int a[], int i, int j, int dir) {
		
		if ((a[i] > a[j] && dir == 1) || (a[i] < a[j] && dir == 0)) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	
	static void bitonicMerge(int a[], int low, int cnt, int dir) {
		if (cnt > 1) {
			int k = cnt/2;
			for (int i = low; i < low +k; i++) {
				compAndSwap(a, i, i+k, dir);
			}
			bitonicMerge(a, low, k, dir);
			bitonicMerge(a, low+k, k, dir);
		}
	}
	
	static void bitonicSort(int a[], int low, int cnt, int dir) {
		if(cnt > 1) {
			int k = cnt/2;
			bitonicMerge(a, low, k, 1);
			bitonicSort(a, low+k, k, 0);
			bitonicMerge(a, low, cnt, dir);
		}
	}
	
	static void sort(int a[],int n, int up) {
		bitonicSort(a, 0, n, up);
	}
	
	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int a[] = {3,7,4,8,6,2,1,5};
		int up=1;
		//si up es 0 de mayor a menor
		//si es 1 de menor a mayor
		printArray(a);
		sort(a, a.length, up);
		printArray(a);
		

	}

}
