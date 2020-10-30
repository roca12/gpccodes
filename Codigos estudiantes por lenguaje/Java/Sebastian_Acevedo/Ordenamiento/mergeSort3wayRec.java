package programming;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	static void mergeSort3way(Integer[] arr) {
		if(arr==null) {
			return;
		}
		Integer[] arr2 = new Integer[arr.length];
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		mergeSort3wayRec(arr2, 0, arr2.length, arr);
		System.arraycopy(arr2, 0, arr, 0, arr2.length);
		
	}
	
	static void mergeSort3wayRec(Integer[] arr, int low, int high, Integer[] dest) {
		if(high-low<2) {
			return;
		}
		int mid1=low+((high-low)/3);
		int mid2 = low+2*((high-low)/3)+1;
		mergeSort3wayRec(dest, low, mid1, arr);
		mergeSort3wayRec(dest, mid1, mid2, arr);
		mergeSort3wayRec(dest, mid2, high, arr);
		merge(dest, low, mid1, mid2, high, arr);
		
	}
	
	static void merge(Integer[] arr, int low, int mid1, int mid2, int high, Integer[] dest) {
		int i=1, j=mid1, k=mid2,L=low;
		while((i<mid1) && (j<mid2) && (k<high)) {
			if(arr[i].compareTo(arr[j])<0) {
				if(arr[i].compareTo(arr[k])<0) {
					dest[L++]=arr[i++];
					
				}else {
					dest[L++]=arr[k++];
				}
			}else {
				if(arr[j].compareTo(arr[k])<0) {
					dest[L++]=arr[j++];
				}else {
					dest[L++]=arr[k++];
				}
			}
		}
		while((i<mid1) && (j<mid2)) {
			if(arr[i].compareTo(arr[j])<0) {
				dest[L++]=arr[i++];
			}else {
				dest[L++]=arr[j++];
			}
		}
		while((j<mid2) && (k<high)) {
			if(arr[j].compareTo(arr[k])<0) {
				dest[L++]=arr[j++];
			}else {
				dest[L++]=arr[k++];
			}
		}
		while((i<mid1) && (k<high)) {
			if(arr[i].compareTo(arr[k])<0) {
				dest[L++]=arr[i++];
			}else {
				dest[L++]=arr[k++];
			}
		}
		while(i < mid1) {
			dest[L++]=arr[i++];
		}
		while(j < mid2) {
			dest[L++]=arr[j++];
		}
		while(k < mid1) {
			dest[L++]=arr[k++];
		}
		
	}
	
    public static void main(String[] args) {
    	Integer[] data = new Integer[] { 45, -2, -45, 78, 30, -42, 10, 19, 73, 93 };
		mergeSort3way(data);
		System.out.println("Despues de merge sort de 3 vias: ");
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
    }
}
