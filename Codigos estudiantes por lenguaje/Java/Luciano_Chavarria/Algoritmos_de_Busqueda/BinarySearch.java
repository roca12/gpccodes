
import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Busqueda_Binaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {2,3,4,5,6};
        int n=arr.length;
        int x=5;
        int resultado = binarysearch(arr, 0, n-1, x);
        if(resultado==-1) {
            System.out.println("Elemento no encontrado");
        }else {
            System.out.println("Elemento encontrado en el indice "+resultado);
        }
        
    }
    static int binarysearch(int arr[],int l,int r,int x) {
        if (r>=l) {
            int mid=l+(r-1)/2;
            if(arr[mid]==x) {
                return mid;
            }
            if(arr[mid]>x) {
                return binarysearch(arr, l, mid-1, x);
            }else {
                return binarysearch(arr, mid+1, r, x);
            }
        }
        return -1;
    }
    
}
