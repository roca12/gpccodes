package programming;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	static void countSort(char arr[]) {
		int n = arr.length;
		char output [] = new char[n];
		int count []= new int [256];
		Arrays.fill(count, 0);
		for (int i = 0; i < n; i++) {
			count[arr[i]]++;
			
		}
		for (int i = 1; i <= 255; i++) {
			count[i]+=count[i-1];
			
		}
		for (int i = n-1; i >=0; i--) {
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		for (int i = 0; i < n; i++) {
			arr[i]=output[i];
		}
		
	}
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char arr[]= {'g', 'e', 'e', 'k','s','f','o','r','g','e','k','s'};
        countSort(arr);
        for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
    }
}
