public class Main {

    public static void main(String[] args) {
        int arr[] = {1, 422, 789, 2333, 2444};
        int n = arr.length;
        Pair resultado = getmaxmin(arr, n);
        System.out.println("El minimo es: " + resultado.min);
        System.out.println("El maximo es: " + resultado.max);
    }

    static class Pair {

        int max;
        int min;
    }

    static Pair getmaxmin(int arr[], int n) {
        Pair minmax = new Pair();
        int i;
        if (n == 1) {
            minmax.max = arr[0];
            minmax.min = arr[0];
            return minmax;
        }
        if (arr[0] > arr[1]) {
            minmax.max = arr[0];
            minmax.min = arr[1];

        } else {
            minmax.max = arr[1];
            minmax.min = arr[0];
        }
        for (i = 2; i < n; i++) {
            if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }

}
