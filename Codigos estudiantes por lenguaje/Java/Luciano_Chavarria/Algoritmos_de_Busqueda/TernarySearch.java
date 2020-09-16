
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int l, r, resultado, key;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        l = 0;
        r = arr.length - 1;
        key = 7;
        resultado = TernarySearch(l, r, key, arr);
        if (resultado == -1) {
            System.out.println("No encontrado");
        } else {
            System.out.println("Encontrado en la posicion: " + resultado);
        }
    }
     

    public static int TernarySearch(int l, int r, int key, int[] arr) {
        if (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;
            if (arr[mid1] == key) {
                return mid1;
            }
            if (arr[mid2] == key) {
                return mid2;
            }
            if (key < arr[mid1]) {
                return TernarySearch(l, mid1 - 1, key, arr);
            } else if (key > arr[mid2]) {
                return TernarySearch(mid2 + 1, r, key, arr);
            } else {
                return TernarySearch(mid1 + 1, mid2 - 1, key, arr);
            }
        }
        return -1;
    }

}
