public class Main {
	static boolean findPair(int arr[],int n,int size){
		int i=0,j=1;
		while(i<size && j < size){
			if(i!=j && arr[j]-arr[i] ==n){
				System.out.println("par encontrado ("+arr[i]+" "+arr[j]+")");
				return true;
			}else if(arr[j]-arr[i] <n ){
				j++;
			}else{
				i++;
			}
		}
		System.out.println("no hay par que de el numero");
		return false;
		}
	public static void main(String[] args) {
		int arr[]={1,8,30,40,100};
		int n=7;
		int size=arr.length;
		findPair(arr,n,size);
	}
}
