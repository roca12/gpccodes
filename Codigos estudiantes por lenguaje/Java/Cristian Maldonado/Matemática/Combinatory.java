public class Combinatory {

    static void combUtil(int arr[], int data[], int start, int end, int index, int r){
        if(index == r){
            for (int i = 0; i < r; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println("");
            return;
        }
        for(int i = start; i <= end && end - i + 1 >=r - index; i++){
            data[index] = arr[i];
            combUtil(arr, data, i + 1, end, index + 1, r);
        }
    }
    
    static void printComb(int arr[], int n, int r){
        int data[]= new int[r];
        combUtil(arr, data, 0,  n -1 , 0, r);
}
    
    public static void main(String[] args) {
        int arr[]={10, 2, 4, 6, 7};
        int r = 3;
        int n = arr.length;
        printComb(arr, n, r);
    }   
}
