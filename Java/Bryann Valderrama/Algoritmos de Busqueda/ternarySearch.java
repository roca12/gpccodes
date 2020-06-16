public class Main {

    static int ternarySearch(int izq, int der, int num, int lista[]) {
        if (der >= izq) {
            int mid1 = izq + (der - izq) / 3;
            int mid2 = der - (der - izq) / 3;
            if (lista[mid1] == num) {
                return mid1;
            }
            if (lista[mid2] == num) {
                return mid2;
            }
            if (num < lista[mid1]) {
                return ternarySearch(izq, mid1 - 1, num, lista);
            } else if (num > lista[mid2]) {
                return ternarySearch(mid2 + 1, der, num, lista);
            } else {
                return ternarySearch(mid1 + 1, mid2 - 1, num, lista);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int izq, der, resultado, x;
        int lista[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        izq = 0;
        der = lista.length - 1;
        x = 5;
        resultado = ternarySearch(izq, der, x, lista);
        if (resultado == -1) {
            System.out.println("El elemento no esta en la lista");
        } else {
            System.out.println("Encontrado en el indice " + resultado);
        }
    }
}
