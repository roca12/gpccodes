public class Main {
	static void minAbsSumPair(int arr[],int n) {
		int l,r,min_sum,sum,min_l,min_r;
		if(n<2) {
			System.out.println("entrada invalida");
		return;
		}
		min_l=0;
		min_r=1;
		min_sum=arr[0]+arr[1];
		for (l = 0; l < n-1; l++) {
			for (r = 0;  r<n ; r++) {
				sum=arr[l]+arr[r];
				if(Math.abs(min_sum)>Math.abs(sum)) {
					min_sum=sum;
					min_l=l;
					min_r=r;
				}
			}
		}
		System.out.println("Los dos elementos con minima suma son "+arr[min_l]+" "+arr[min_r]);
	}
	public static void main(String[] args) {
		int arr[] = { 1,-1,8,56,-18,564,-52};
		int n = arr.length;
		minAbsSumPair(arr, n);
	}
}
