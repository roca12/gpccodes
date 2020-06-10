public class Main {

    public static void main(String[] args) {
        int lista[] = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int missed = getMissingNum(lista, lista.length);
        System.out.println("Numero perdido " + missed);
    }

    static int getMissingNum(int lista[], int n) {
        int x1 = lista[0];
        int x2 = 1;
        for (int i = 1; i < n; i++) {
            x1 = x1 ^ lista[i];
        }
        for (int i = 2; i <= n + 1; i++) {
            x2 = x2 ^ i;
        }
        return x1 ^ x2;
    }
}
