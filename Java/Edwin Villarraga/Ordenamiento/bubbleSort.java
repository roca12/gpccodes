import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String entrada[]=br.readLine().split(" ");
		int arr[]=new int[entrada.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=Integer.parseInt(entrada[i]);
		}
		bubble_sort(arr,arr.length);
		for(int i:arr) {
		System.out.print(i+" ");
		}
	}
	static void bubble_sort(int arr[],int n) {
		if(n==1) {
			return;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-1; j++) {
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
			}
		}
	}
}
