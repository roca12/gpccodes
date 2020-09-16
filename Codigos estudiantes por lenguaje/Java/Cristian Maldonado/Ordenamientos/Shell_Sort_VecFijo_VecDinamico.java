import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Shell_Sort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada[] = br.readLine().split(" ");
        int arr[] = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            arr[i] = Integer.parseInt(entrada[i]);
        }
        shellSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        dinamico();
    }

    static int shellSort(int arr[]) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
        return 0;
    }

    static void dinamico() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada[] = br.readLine().split(" ");
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < entrada.length; i++) {
            lista.add(i, Integer.parseInt(entrada[i]));
        }
        shellSortDinamico(lista);
        for (Integer i : lista) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    static int shellSortDinamico(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = arr.get(i);
                int j;
                for (j = i; j >= gap && arr.get(j - gap) > temp; j -= gap) {
                    arr.remove(j);
                    arr.add(j, arr.get(j - gap));
                }
                arr.remove(j);
                arr.add(j, temp);
            }
        }
        return 0;
    }
}
