package programming;
import java.util.Scanner;

public class Main{
	
	static class Hoja{
		int key;
		Hoja izquierda, derecha;
		
		public Hoja(int item) {
			key=item;
			derecha=izquierda=null;
		}
	}
	
	static Hoja root;
	static void init() {
		root=null;
	}
	static void insert(int key) {
		root =insertRec(root,key);
	}
	static Hoja insertRec(Hoja root, int key) {
		if(root==null) {
			root=new Hoja(key);
			return root;
		}
		if(key<root.key) {
			root.izquierda=insertRec(root.izquierda, key);
		}else if(key>root.key) {
			root.derecha=insertRec(root.derecha, key);
		}
		return root;
	}
	
	static void inOrder(Hoja root) {
		if(root!=null) {
			inOrder(root.izquierda);
			System.out.print(root.key+" ");
			inOrder(root.derecha);
		}
	}
	
	static void insertInTree(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			insert(arr[i]);
		}
	}
	
	public static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
/*	static void posOrder(Hoja raíz) {
		if(raíz!=null) {
			inOrder(raíz.derecha);
			System.out.print(raíz.key+" ");
			
			inOrder(raíz.izquierda);
		}
	}
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {5,21,7,23,19};
        int n=arr.length;
        printArray(arr, n);
        insertInTree(arr);
        System.out.println(" ");
        inOrder(root);
   //     posOrder(root);   Aun no funciona
        
    }
}
