//BUSQUEDA TERNARIA - TERNARY SEARCH
public class Busquedas3 {

	static int ternarySearch (int left, int right, int key, int arr[]) {
		if(right >= left) {
			int mid1 = left + (right - left)/3;
			int mid2 = right - (right - left)/3;
			if(arr[mid1] == key) {
				return mid1;
			}
			if(arr[mid2] == key) {
				return mid2;
			}
			if(key<arr[mid1]) {
				return ternarySearch(left, mid1-1, key, arr);
			}else if(key>arr[mid2]) {
				return ternarySearch(mid2+1, right, key, arr);
			}else {
				return ternarySearch(mid1+1, mid2-1, key, arr);
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int l, r, p, key;
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		l = 0;
		r = 9;
		key = 5;
		p = ternarySearch(l, r, key, arr);
		System.out.println("Indice de " + key + " es " + p );
		key = 50;
		p = ternarySearch(l, r, key, arr);
		System.out.println("Indice de " + key + " es " + p);
	}

}
