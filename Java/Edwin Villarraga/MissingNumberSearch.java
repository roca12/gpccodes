public class Main {
	static int MissingNoSearch(int arr[],int n){
		int x1=arr[0];
		int x2=1;
			for(int i=1;i<n;++i){
				x1=x1^arr[i];
			}
			for(int i=2;i<=n+1;++i){
				x2=x2^i;
			}
		return (x1^x2);
		}
	public static void main(String[] args) {
		 int arr[]={1,3,4,5,6,7};
		   int n=arr.length;
		System.out.println("el numero faltante es: "+MissingNoSearch(arr, n));
	}
}
