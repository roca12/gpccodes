public class Main {

    public static void main(String[] args) {
        int arreglo[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int numeroabuscar = 55;
        int resultado = jumpSearch(arreglo, numeroabuscar);
        if (resultado == -1) {
            System.out.println("No encontrado");
        } else {
            System.out.println("Encontrado en el indice " + resultado);
        }
    }

    static int jumpSearch(int arreglo[], int x) {
        int n = arreglo.length;
        int salto = (int) Math.floor(Math.sqrt(n));
        int previo = 0;
        while (arreglo[Math.min(salto, n) - 1] < x) {
            previo = salto;
            salto = salto + (int) Math.floor(Math.sqrt(n));
            if (previo >= n) {
                return -1;
            }
        }
        while (arreglo[previo] < x) {
            previo++;
            if (previo == Math.min(salto, n)) {
                return -1;
            }
        }
        if (arreglo[previo] == x) {
            return previo;
        }
        return -1;
    }
}
