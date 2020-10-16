package programming;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
	
	
	static void shellSort(int arr[]) {
		int n = arr.length;
		for (int salto = n/2; salto>0; salto/=2) {
			for (int i = salto; i < n; i++) {
				int temp=arr[i];
				int j2;
				for (j2 = i; j2 >=salto&&arr[j2-salto]>temp; j2-=salto) {
					arr[j2]=arr[j2-salto];
				}
				arr[j2]=temp;
			}
		}
	}
	
	static void printArry(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int arr[]= {170, 45, 75, 90, 802, 24, 2, 66};
    	int n=arr.length;
        printArry(arr);
        shellSort(arr);
        printArry(arr);
    }
}
