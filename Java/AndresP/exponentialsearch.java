
import java.io.*;
import java.util.ArrayList;
import java.util.*;
 
public class Binary_search {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    ArrayList<Integer>lista=new ArrayList<Integer>();
    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);
    lista.add(5);
        int x = 5;
        Integer a[] = new Integer[lista.size()];
        int resultado = exponencialsearch(lista.toArray(a), lista.size(), x);
        System.out.println(
                (resultado < 0) ? "El resultado no está presente en el array" : "Elemento encontrado en: " + resultado);

    
        System.out.println(13/5);
    }
    
        
    
    
static int exponencialsearch(Integer[] arr,int n ,int x) {
            if (arr[0]==x) {
                return 0;
            }
                int i=1;
                while (i<n&&arr[i]<=x) {                
                i=i*2;
            }
                return Arrays.binarySearch(arr,i/2,Math.min(i, n),x);
            }
      
  

        }
