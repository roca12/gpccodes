public class Main {

    public static void main(String[] args) {
        int arreglo[] = {1, 4, 6, 3, 8, 2};
        int tamanio = arreglo.length;
        Pair resultado = getMaxMin(arreglo, tamanio);
        System.out.println("El minimo elemento es " + resultado.min);
        System.out.println("El maximo elemento es " + resultado.max);
    }

    static class Pair {

        int min;
        int max;
    }

    static Pair getMaxMin(int arreglo[], int n) {
        Pair minmax = new Pair();
        int i;
        if (n == 1) {
            minmax.max = arreglo[0];
            minmax.min = arreglo[0];
            return minmax;
        }
        if (arreglo[0] > arreglo[1]) {
            minmax.max = arreglo[0];
            minmax.min = arreglo[1];
        } else {
            minmax.max = arreglo[1];
            minmax.min = arreglo[0];
        }
        for (i = 2; i < n; i++) {
            if (arreglo[i] > minmax.max) {
                minmax.max = arreglo[i];
            } else if (arreglo[i] < minmax.min) {
                minmax.min = arreglo[i];
            }
        }
        return minmax;
    }
}
