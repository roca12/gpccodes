import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String entrada[]=br.readLine().split(" ");
		int arr[]=new int[entrada.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(entrada[i]);
		}
		quickSort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
	static int partition (int arr [], int low, int high){
	    int pivot = arr[high];
	    int i = low - 1;
	    for(int j = low; j < high; j++){
	        if(arr[j] <= pivot){
	            i++;
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	        }
	    }
	    int temp = arr[i + 1];
	    arr[i + 1] = arr[high];
	    arr[high] = temp;
	    return i + 1;
	}
	static void quickSort(int arr[], int low, int high){
	    if(low < high){
	        int pivot = partition(arr, low, high);
	        quickSort(arr, low, pivot - 1);
	        quickSort(arr, pivot + 1, high);
	    }
	}

}
