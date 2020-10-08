public class Main {
     static void minAbsPair(int arr[], int arrsize){
         int left,right,min_sum,sum,minl,minr;
         if(arrsize<2){
             System.out.println("invalido como el java de luciano");
             return;
         }
         minl=0;
         minr=1;
         min_sum=arr[0]+arr[1];
         for (left = 0; left < arrsize-1; left++) {
             for (right = left+1; right < arrsize; right++) {
                 sum=arr[left]+arr[right];
                 if(Math.abs(min_sum)>Math.abs(sum)){
                     min_sum=sum;
                     minl=left;
                     minr=right;
                 }
             }
         }
         System.out.println(" Los dos elementos los cuales " + "tienen la suma minima son " + arr[minl] + " y " + arr[minr]);
         
     }
     
    public static void main(String[] args) {
        int arr[] = {1, 60, -10, 70, -80, 85};
        minAbsPair(arr, arr.length);
    }
}
