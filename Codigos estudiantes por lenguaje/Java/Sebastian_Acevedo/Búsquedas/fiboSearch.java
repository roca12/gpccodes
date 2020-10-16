
public class Main {
    
    static int min(int x, int y){
        return (x<=y)?x:y;
    }
    static int fiboSearch(int arr[], int x, int n){
        int fibMM2 = 0;
        int fibMM1 = 1;
        int fibM = fibMM2+fibMM1;
            while (fibM<n){
                fibMM2=fibMM1;
                fibMM1=fibM;
                fibM= fibMM1+fibMM2;
            }
            int offset = -1;
            while(fibM>1){
                int i = min(offset+fibMM2, n-1);
                if(arr[i]<x){
                    fibM=fibMM1;
                    fibMM1=fibMM2;
                    fibMM2= fibM-fibMM1;
                    offset=i;
                    System.out.println(fibM);
                }else if (arr[i]>x){
                    fibM=fibMM2;
                    fibMM1=fibMM1-fibMM2;
                    fibMM2 = fibM - fibMM1;
                }else return i;
            }
            if(fibMM1 == 1 && arr[offset + 1] == x){
                return offset + 1;
            }
            return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 22, 35, 40, 45, 50,80, 82, 85, 90, 100};
        
        int n = 11;
        int x = 85 ;
 System.out.println("Found at index: "  + fiboSearch(arr, x, n));


    }
}
