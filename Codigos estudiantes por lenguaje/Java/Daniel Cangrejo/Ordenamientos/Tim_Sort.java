import java.util.Scanner;

public class Main{
	
	static int RUN=32;
	
	static void insertionSort(int arr[], int left, int right) {
	for (int i = left+1; i <= right; i++) {
		int temp = arr[i];
		int j=i-1;
		while(arr[j] > temp && j>=left) {
			arr[j+1]=arr[j];
			j--;
			if (j<0) {
				break;
			}
		}
		arr[j+1]=temp;
	 }
	}

	static void merge(int arr[],int left, int mid, int right) {
		int len1 = mid-left+1, len2 = right-mid;
		int L[]=new int [len1];
		int R[]= new int [len2];
		for (int x = 0; x < len1; x++) {
			L[x]=arr[left+x];
		}
		for (int x = 0; x < len2; x++) {
			R[x]=arr[mid+1+x];
		}
		int i=0,j=0,k=left;
		while (i<len1 && j<len2) {
			if (L[i]<=R[j]) {
				arr[k]=L[i];
				i++;
			}else {
				arr[k]=R[j];
				j++;
			}
			k++;
			
		}
		while(i<len1) {
			arr[k]=L[i];
			i++;
			k++;
		}
		while(j<len2) {
			arr[k]=R[j];
			j++;
			k++;
		}
	}	
	
	static void timSort(int arr[], int n) {
		for (int i = 0; i < n; i+=RUN) {
			insertionSort(arr, i, Math.min((i+31),(n-1)));
			
		}
		for (int size = RUN; size < n; size=2*size) {
			for (int left = 0; left < n; left+=2*size) {
				int mid=left+size-1;
				int right = Math.min((left+2*size-1), (n-1));
				merge(arr, left, mid, right);
			}
		}
	}
	
	public static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {5,21,7,23,19};
        int n=arr.length;
        printArray(arr, n);
        timSort(arr, n);
        printArray(arr, n);
    }
}
