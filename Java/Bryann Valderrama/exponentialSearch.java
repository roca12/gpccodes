import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        int x = 4;
        Integer a[] = new Integer[lista.size()];
        int resultado = exponentialSearch(lista.toArray(a), lista.size(), x);
        System.out.println(
                (resultado < 0) ? "El resultado no está presente en el array" : "Elemento encontrado en el indice: " + resultado);

    }

    static int exponentialSearch(Integer arr[], int n, int x) {
        if (arr[0] == x) {
            return 0;
        }
        int i = 1;
        while (i < n && arr[i] <= x) {
            i = i * 2;
        }
        return Arrays.binarySearch(arr, i / 2, Math.min(i, n), x);
    }
}
