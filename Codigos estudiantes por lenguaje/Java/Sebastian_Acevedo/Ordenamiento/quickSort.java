package programming;
import java.util.Scanner;
public class Main{
	
	static int partition(int arr[], int low, int high) {
		int pivot= arr[high];
		int i=(low-1);
		for (int j = low; j < high; j++) {
			if(arr[j]<=pivot) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return i + 1;
	}
	
	static void quickSort(int arr[], int low, int high) {
		if(low < high) {
			int pi=partition(arr, low, high);
			quickSort(arr, low, pi-1);
			quickSort(arr, pi+1, high);
		}
	}
	
	static void print(int arr[]) {
		int n=arr.length;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int arr[]= {10, 7, 8, 9, 1, 5};
    	print(arr);
    	quickSort(arr, 0, arr.length-1);
    	print(arr);
    }
}
