public class Main {

    static void shellSort(int arr[]) {
        int n = arr.length;
        for (int salto = n/2; salto > 0; salto /= 2) {
            for (int i = salto; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= salto && arr[j-salto] > temp; j-= salto) {
                    arr[j] = arr[j-salto];
                }
                arr[j] = temp;
            }
        }
    }
    
    static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 2, 0, 99, -1};
        print(arr);
        shellSort(arr);
        print(arr);
        
    }

}
