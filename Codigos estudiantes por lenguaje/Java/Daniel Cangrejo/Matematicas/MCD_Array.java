import java.io.PrintWriter;
import java.util.*;


public class Main {
	
	static int gcd(int a, int b) {
		return a==0?b:(gcd(b%a, a));
	}

	static int findGCD(int arr[], int n) {
		int res = arr[0];
		for (int i = 0; i < n; i++) {
			res = gcd(arr[i], res);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] ={80, 45, 70};
		int n = arr.length;
		System.out.println("El máximo común divisor es: " + findGCD(arr, n));
	
	}
}
