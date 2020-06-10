public class Main {

    public static void main(String[] args) {
        int lista[] = {1, 60, -10, 65, -43, 34};
        minAbsSumPair(lista, lista.length);
    }

    static void minAbsSumPair(int lista[], int n) {
        int izq, der, min_sum, sum, min_izq, min_der;
        if (n < 2) {
            System.out.println("Array no tiene la cantidad de valores necesarios");
            return;
        }
        min_izq = 0;
        min_der = 1;
        min_sum = lista[0] + lista[1];
        for (izq = 0; izq < n - 1; izq++) {
            for (der = izq + 1; der < n; der++) {
                sum = lista[izq] + lista[der];
                if (Math.abs(min_sum) > Math.abs(sum)) {
                    min_sum = sum;
                    min_izq = izq;
                    min_der = der;
                }
            }
        }
        System.out.println("Los dos elementos los cuales tienen la suma minima son " + lista[min_izq] + " y " + lista[min_der]);
    }
}
