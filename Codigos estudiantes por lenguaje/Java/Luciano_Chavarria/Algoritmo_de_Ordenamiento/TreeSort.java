import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String entrada[] = br.readLine().split(" ");
        int arr[] = new int[entrada.length];
        for (int i = 0; i < entrada.length; i++) {
            arr[i] = Integer.parseInt(entrada[i]);
        }
        treeInsert(arr);
        inroderRec(root);
    }

    static class Nodo {

        int key;
        Nodo izquierda, derecha;

        public Nodo(int item) {
            this.key = item;
            izquierda = derecha = null;
        }

    }
    static Nodo root;

    static void init() {
        root = null;
    }

    static void insert(int key) {
        root = insertRec(root, key);
    }

    static Nodo insertRec(Nodo root, int key) {
        if (root == null) {
            root = new Nodo(key);
            return root;
        }

        if (key < root.key) {
            root.izquierda = insertRec(root.izquierda, key);
        } else if (key >= root.key) {
            root.derecha = insertRec(root.derecha, key);

        }
        return root;
    }

    static void inroderRec(Nodo root) {
        if (root != null) {
            inroderRec(root.izquierda);
            System.out.print(root.key + " ");
            inroderRec(root.derecha);
        }
    }

    static void treeInsert(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }

}
