public class Main {

	static int binarySearch(int arr[], int left, int right, int x) {
		if (right>=left) {
			int mid=left+(right-left)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[mid]>x) {
				return binarySearch(arr, left, mid-1, x);
			}
			if(arr[mid]<x) {
				return binarySearch(arr, mid+1, right, x);
			}
		}
		return -1;
	}
	
    public static void main(String[] args) {
    	int arr[]= {2,3,4,10,40};
    	int n=arr.length;
    	int x=2;
    	int result=binarySearch(arr, 0, n-1, x);
    	if(result==-1)System.out.println("No encontró el dato");
    	else System.out.println("El dato está en la pos "+ result);
    	
    }
}
