public class Main {
	static int binarySearch(int arr[], int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == x) {
				return mid;
			}
			return binarySearch(arr, mid + 1, r, x);
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int n = arr.length;
		int x = 10;
		int result = binarySearch(arr, 0, n - 1, x);
		if (result == -1) {
			System.out.println("Elemento no presente");
		} else {
			System.out.println("Elemento fue encontrado en la posición " + result);
		}
	}
}
