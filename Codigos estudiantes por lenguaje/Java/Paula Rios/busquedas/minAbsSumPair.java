import java.util.Scanner;
public class Main {
    static void minAbsSumPair(int arr[], int arrsize){
        int left,right,min_sum,sum,min1,minr;
        if(arrsize<2){
            System.out.println("invalido");
            return;
        }
        min1=0;
        minr=1;
        min_sum=arr[0]+arr[1];
        for (left=0; left <arrsize-1; left++){
           for(right=left+1 ;right<arrsize; right++){
               sum=arr[left]+arr[right];
               if(Math.abs(min_sum)>Math.abs(sum)){
                   min_sum=sum;
                   min1=left;
                   minr=right;
               }
           } 
        }
        System.out.println("los dos elementos los cuales "+"tienen la suma minima son: "+arr[min1]+" y "+arr[minr]+"="+min_sum);
        
           
          
    }
    public static void main(String[] args) {
      int arr[]={1,60,-10,70,-80,85};
      minAbsSumPair(arr,6);
      
    }
    
}
