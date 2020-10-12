import java.util.*;
public class ejercicios {
	static void cocktail(int vec[]) {
		boolean cambio=true;
		int inicio=0;
		int finales=vec.length;
		while(cambio == true) {
			cambio=false;
			for (int i = inicio; i < finales-1; i++) {
				if(vec[i]>vec[i+1]) {
					int aux=vec[i];
					vec[i]=vec[i+1];
					vec[i+1]=aux;
					cambio=true;
				}
			}
			if(cambio==false) {
				break;
			}
			cambio=false;
			finales=finales-1;
			for (int i = finales-1; i >= inicio; i--) {
				if(vec[i]>vec[i+1]) {
					int aux=vec[i];
					vec[i]=vec[i+1];
					vec[i+1]=aux;
					cambio=true;
				}
			}
			inicio=inicio+1;
		}
	}

	static void soutvec(int vec[]) {
		for (int i = 0; i < vec.length; i++) {
			System.out.print(vec[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Random r= new Random();
		int vec[]=new int [200];
		for (int i = 0; i < vec.length; i++) {
			vec[i]=r.nextInt(1000);
		}
		cocktail(vec);
		System.out.println("el arreglo ordenado");
		soutvec(vec);
	}
}
