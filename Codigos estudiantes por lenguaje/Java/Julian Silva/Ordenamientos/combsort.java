import java.util.*;
public class ejercicios {
	static int Gapnext(int gap) {
		gap=(gap+10)/13;
		if(gap<1) {
			return 1;
		}
		return gap;
	}
	static void sort(int vec[]) {
		int gap=vec.length;
		boolean cambio=true;
		while(gap!=1||cambio==true) {
			gap=Gapnext(gap);
			cambio=false;
			for (int i = 0; i < vec.length-gap; i++) {
				if(vec[i]>vec[i+1]) {
					int aux=vec[i];
					vec[i]=vec[i+1];
					vec[i+1]=aux;
					cambio=true;
				}
			}
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
		sort(vec);
		System.out.println("el arreglo ordenado");
		soutvec(vec);
	}
}
