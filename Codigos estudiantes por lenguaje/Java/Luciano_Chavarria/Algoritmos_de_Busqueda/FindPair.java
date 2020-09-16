public class Main{

    public static void main(String[] args) {
        int lista[] = {1, 3, 4, 5, 8, 10, 11};
        int x = 3;
        findPair(lista, x); 
    }

    static boolean findPair(int lista[], int x) {
        int tamanio = lista.length;
        int i = 0, j = 1;
        while (i < tamanio && j < tamanio) {
            if (i != j && lista[j] - lista[i] == x) {
                System.out.println("Par encontrado: " + "(" + lista[j] + "-" + lista[i] + ")"); //Encuentra la primera ocurrencia
                return true;
            } else if (lista[j] - lista[i] < x) {
                j++;
            } else {
                i++;
            }
        }
        System.out.println("No existe el par que logre ser igual a n al restar ");
        return false;
    }
}
