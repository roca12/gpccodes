public class Difference_Pair_Search {
	public static void main (String [] args) {
		int arr[] = {1,8,30,40,100};
		int resultadoDeseado = 60;
		findPair(arr, resultadoDeseado);
	}
	
	static boolean findPair(int arr[],int n) {
		int size = arr.length;
		int i = 0, j = 1;
		while(i < size && j < size) {
			if(i != j && arr[j] - arr[i] == n) {
				System.out.println("Par encontrado: "+"("+arr[i]+", "+arr[j]+ ")");
				return true;
			}else if(arr[j] - arr[i] < n) {
				j++;
			}else {
				i++;
			}
		}
		System.out.println("No existe tal par");
		return false;
	}
}
