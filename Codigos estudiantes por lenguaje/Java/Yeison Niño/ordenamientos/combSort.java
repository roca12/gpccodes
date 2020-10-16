import java.util.*;
public class Main {

    static int getNextGap(int gap){
        
        gap = (gap*10)/13;
        if (gap<1){
        
            return 1;
        }
        return gap;
    }
    
    static void combSort(int arr[]){
    
        int n = arr.length;
        int gap = n;
        boolean swapped = true;
        while(gap != 1 ||swapped == true){
        
            gap = getNextGap(gap);
            swapped = false;
            for (int i = 0; i < n-gap; i++) {
                
                if (arr[i]>arr[i+gap]){
                
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap]=temp;
                    swapped = true;
                }
            }
        }
    }
    
    static void printArray(int a[]){
    
        int n = a.length;
        for (int i = 0; i < n; i++) {
            
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String args[]) {
     
        int arr[] = {5,1,4,2,8,0,2,-44,-58,6};
        combSort(arr);
        printArray(arr);
    }
}
