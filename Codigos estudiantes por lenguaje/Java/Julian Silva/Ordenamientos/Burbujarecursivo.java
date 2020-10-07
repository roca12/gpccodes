import java.util.*;

public class ejercicios {
	static void burbuja(int vec[], int n) {
		//caso base
		if(n==1) {
			return;
		}
		//ordenamiento verificando el siguiente para mover el mas grande hasta el final
		for (int i = 0; i < n-1; i++) {
			if(vec[i]>vec[i+1]) {
				int aux=vec[i];
				vec[i]=vec[i+1];
				vec[i+1]=aux;
			}
		}
		burbuja(vec, n-1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//tamaño de datos del vector
		int a=sc.nextInt();
		int vec[]=new int [a];
		//llenar vector
		for (int i = 0; i < vec.length; i++) {
			vec[i]=sc.nextInt();
		}
		//ordena el vector
		burbuja(vec, vec.length);
		//imprime el vector
		System.out.println(Arrays.toString(vec));
	}

}
