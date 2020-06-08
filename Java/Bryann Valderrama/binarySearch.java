public class Main {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 6};
        int tamanio = arr.length;
        int numeroabuscar = 5;
        int resultado = binarySearch(arr, 0, tamanio - 1, numeroabuscar);
        if (resultado == -1) {
            System.out.println("Elemento no encontrado");
        } else {
            System.out.println("Elemento encontrado en el índice " + resultado);
        }

    }

    static int binarySearch(int arr[], int inicio, int fin, int numeroabuscar) {
        if (fin >= inicio) {
            int medio = inicio + (fin - 1) / 2;
            if (arr[medio] == numeroabuscar) {
                return medio;
            }
            if (arr[medio] > numeroabuscar) {
                return binarySearch(arr, inicio, medio - 1, numeroabuscar);
            } else {
                return binarySearch(arr, medio + 1, fin, numeroabuscar);
            }
        }
        return -1;
    }
}
