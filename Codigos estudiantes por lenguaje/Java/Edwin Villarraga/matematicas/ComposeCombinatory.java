public class Main {

    public static void main(String[] args) {
        int n=5;
        int len=100;
        int arr[]=new int[size];
        printCompositions(arr,n,0);
    }
    static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void printCompositions(int arr[],int n,int i){
        int MAX_POINT=3;
        if(n==0){
            printArr(arr,i);
        }else if(n>0){
            for(int k=1;k<=MAX_POINT;k++){
                arr[i]=k;
                printCompositions(arr,n-k,i+1);
            }
        }
    }


}
