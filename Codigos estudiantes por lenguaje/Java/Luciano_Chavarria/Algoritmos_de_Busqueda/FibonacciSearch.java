public class Main {

    public static void main(String[] args) {
        int arreglo[] = {10, 13, 15, 18, 24, 27, 39, 40, 45, 60, 79, 80, 90, 100};
        int tamanio = arreglo.length;
        int numeroabuscar = 24;
        int resultado = fibonacciSearch(arreglo, numeroabuscar, tamanio);
        if (resultado == -1) {
            System.out.println("No encontrado");
        } else {
            System.out.println("Encontrado en la posicion " + resultado);
        }
    }

    static int min(int x, int y) {
        return x <= y ? x : y;
    }

    static int fibonacciSearch(int arr[], int x, int n) {
        if (x > arr[n - 1]) {
            return -1;
        }

        int fibo1 = 0;
        int fibo2 = 1;
        int fiboM = fibo1 + fibo2;

        while (fiboM < n) {
            fibo2 = fibo1;
            fibo1 = fiboM;
            fiboM = fibo2 + fibo1;
        }

        int offset = -1;

        while (fiboM > 1) {
            int i = min(offset + fibo2, n - 1);
            if (arr[i] < x) {
                fiboM = fibo1;
                fibo1 = fibo2;
                fibo2 = fiboM - fibo1;
                offset = i;
            } else if (arr[i] > x) {
                fiboM = fibo2;
                fibo1 = fibo1 - fibo2;
                fibo2 = fiboM - fibo1;
            } else {
                return i;
            }
        }
        if (fibo1 == 1 && arr[offset + 1] == x) {
            return offset + 1;
        }
        return -1;
    }
}
