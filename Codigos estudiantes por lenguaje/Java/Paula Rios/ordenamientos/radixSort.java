import java.util.Arrays;

public class Main {
  static int getMax(int arr[], int n){
      int max=arr[0];
      for (int i =1; i <n; i++) {
          if(arr[i]>max){
              max=arr[i];
          }
      }
      return max;
  }
  static void counSort(int arr[], int n, int exp){
      int output[]=new int[n];
      int i;
      int count[]=new int[10];
      Arrays.fill(count,0);
      for ( i = 0; i < n; i++) {
          count[(arr[i]/exp)%10]++;
      }
      for (i = 1; i < 10; i++) {
          count[i]+=count[i-1];
      }
      for ( i = n-1; i>=0 ; i--) {
          output[count[(arr[i]/exp)%10]-1]=arr[i];
          count[(arr[i]/exp)%10]--;
      }
      for (int j = 0; j <n; j++) {
          arr[j]=output[j];
      }
  }
  static void radixSort(int arr[],int n){
      int m=getMax(arr,n);
      for(int exp=1;m/exp>0;exp++){
          counSort(arr, n, exp);
      }
  }
  static void print(int arr[],int n){
      for (int i = 0; i <n; i++) {
          System.out.print(arr[i]+" ");
      }
      System.out.println();
  }

    public static void main(String[] args) {
        int arr[]={170,45,75,90,802,24,2,66};
        print(arr,arr.length);
        radixSort(arr, arr.length);
        print (arr,arr.length);
    }
}
