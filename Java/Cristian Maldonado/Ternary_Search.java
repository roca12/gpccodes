public class Ternary_Search {
	public static void main(String[] args) {
		int x, r, resultado, key;
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		x = 0;
		r = arr.length-1;
		key = 6;
		resultado = ternarySearch(x, r, key, arr);
		if(resultado < 0) {
			System.out.println("Elemento no presente en el arreglo");
		}else {
			System.out.println("Elemento encontrado en la posicion "+resultado);
		}
	}

	static int ternarySearch(int x, int r, int key, int arr[]) {
		if (r >= x) {
			int mid1 = x + (r - x) / 3;
			int mid2 = r - (r - x) / 3;
			if (arr[mid1] == key) {
				return mid1;
			}
			if (arr[mid2] == key) {
				return mid2;
			}
			if (key < arr[mid1]) {
				return ternarySearch(x, mid1 - 1, key, arr);
			} else if (key > arr[mid2]) {
				return ternarySearch(mid2 + 1, r, key, arr);
			} else {
				return ternarySearch(mid1 + 1, mid2 - 1, key, arr);
			}
		}
		return -1;
	}
}
