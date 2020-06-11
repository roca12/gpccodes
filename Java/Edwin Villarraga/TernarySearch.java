public class Main {
	static int ternarySearch(int left,int r,int key,int arr[]){
		if(r>=left){
			int mid1 = left + (r-left)/3;
			int mid2 = r - (r-left)/3;
			if (arr[mid1]==key){
				return mid1;
			}
			if(arr[mid2]==key){
				return mid2;
			}if(key<arr[mid1]){
				return ternarySearch(left,mid1-1,key,arr);
			}else if(key>arr[mid2]){
				return ternarySearch(mid2+1,r,key,arr);
			}else{
				return ternarySearch(mid1+1,mid2-1,key,arr);
			}
			
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9};
		int l=0;
		int r=9;
		int x=5;
		int result = ternarySearch(l,r,x,arr);
		if(result<0){
			System.out.println("el numero "+x+" no se encuentra en el array");
		}else{
		System.out.println("indice encontrado en la posicion "+result);
	}
	}
}
