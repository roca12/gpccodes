import java.io.PrintWriter;
import java.util.*;

//Mínimo Común Múltiplo de Array
public class Main {
	
	static long LCMarray(long [] arr) {
		long ans = 1;
		int divisor = 2;
		while(true) {
			int cont = 0;
			boolean divisible = false;
			for (int i = 0; i < arr.length; i++) {
				if (arr[0] == 0){
					return 0;
				}else if (arr[i] < 0) {
					arr[i] = Math.abs(arr[i]);	
				}
				if (arr[i] == 1) {
					cont++;
				}
				if (arr[i]%divisor == 0) {
					divisible = true;
					arr[i] = arr[i] / divisor;
				}
			}
			if(divisible == true) {
				ans = ans * divisor;
			}else {
				divisor++;
			}
			if(cont==arr.length) {
				return ans;
			}
		}
	}
	
	public static void main(String[] args) {
		long arr[] = {15, 12, 18};
		System.out.println(LCMarray(arr));
		
	}
}
