import java.util.*;
public class ejercicios {

	public static void mergeSort3Way(Integer[] gArray) {
//Si el arrat tiene tamaño 0, retorna null 
		if (gArray == null) {
			return;
		}
//Creando duplicado del array dado
		Integer[] fArray = new Integer[gArray.length];
//Copiando elementos del array dado al
//array duplicado
		System.arraycopy(gArray, 0, fArray, 0, fArray.length);
		mergeSort3WayRec(fArray, 0, gArray.length, gArray);
//Copiando elementos del array duplicado al
//array dado
		System.arraycopy(fArray, 0, gArray, 0, fArray.length);
	}

	/*
	 * Realizando el algoritmo Merge Sort en el array dado para los valores en el
	 * rando de los indices [low,high], low es el menor y high es el mayor Exclusivo
	 */
	public static void mergeSort3WayRec(Integer[] gArray, int low, int high, Integer[] destArray) {
//Si el array tiene tamaño 1 no haga nada 
		if (high - low < 2) {
			return;
		}
// Separando el array en tres partes 
		int mid1 = low + ((high - low) / 3);
		int mid2 = low + 2 * ((high - low) / 3) + 1;
// Ordenando las tres partes recursivamente 
		mergeSort3WayRec(destArray, low, mid1, gArray);
		mergeSort3WayRec(destArray, mid1, mid2, gArray);
		mergeSort3WayRec(destArray, mid2, high, gArray);
// Uniendo las tres partes
		merge(destArray, low, mid1, mid2, high, gArray);
	}

	/*
	 * Une los rangos ordenados (low, mid1),(mid1,mid2) y (mid2, high), mid 1 es el
	 * primer indice punto medio en todo el rando para unir mid2 es segundo
	 */ public static void merge(Integer[] gArray, int low, int mid1, int mid2, int high, Integer[] destArray) {
		int i = low, j = mid1, k = mid2, l = low;
// escoje el más pequeño de los más pequeños en los
//tres rangos
		while ((i < mid1) && (j < mid2) && (k < high)) {
			if (gArray[i].compareTo(gArray[j]) < 0) {
				if (gArray[i].compareTo(gArray[k]) < 0) {
					destArray[l++] = gArray[i++];
				} else {
					destArray[l++] = gArray[k++];
				}

			} else {
				if (gArray[j].compareTo(gArray[k]) < 0) {
					destArray[l++] = gArray[j++];
				} else {
					destArray[l++] = gArray[k++];
				}
			}
		}
		while ((i < mid1) && (j < mid2)) {
			if (gArray[i].compareTo(gArray[j]) < 0) {
				destArray[l++] = gArray[i++];
			} else {
				destArray[l++] = gArray[j++];
			}
		}
		while ((j < mid2) && (k < high)) {
			if (gArray[j].compareTo(gArray[k]) < 0) {
				destArray[l++] = gArray[j++];
			} else {
				destArray[l++] = gArray[k++];
			}
		}
		while ((i < mid1) && (k < high)) {
			if (gArray[i].compareTo(gArray[k]) < 0) {
				destArray[l++] = gArray[i++];
			} else {
				destArray[l++] = gArray[k++];
			}
		}
		while (i < mid1) {
			destArray[l++] = gArray[i++];
		}
		while (j < mid2) {
			destArray[l++] = gArray[j++];
		}
		while (k < high) {
			destArray[l++] = gArray[k++];
		}
	}

	public static void main(String args[]) {
		Integer[] data = new Integer[] { 45, -2, -45, 78, 30, -42, 10, 19, 73, 93 };
		mergeSort3Way(data);
		System.out.println("Despues de merge sort de 3 vias: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
	}
}
