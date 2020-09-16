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
        inorderRec(root);
    }
    
    static class Nodo {
        
        int key;
        Nodo izq, der;
        
        public Nodo(int item) {
            this.key = item;
            izq = der = null;
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
            root.izq = insertRec(root.izq, key);
        } else if (key >= root.key) {
            root.der = insertRec(root.der, key);
        }
        return root;
    }
    
    static void inorderRec(Nodo root) {
        if (root != null) {
            inorderRec(root.izq);
            System.out.print(root.key + " ");
            inorderRec(root.der);
        }
    }
    
    static void treeInsert(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }
    }
}
