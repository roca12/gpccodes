import java.util.*;

public class ejercicios {
    static void burbuja(int vec[], int n) {
        
        if(n==1) {
            return;
        }
   
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
        
        int a=sc.nextInt();
        int vec[]=new int [a];
        
        for (int i = 0; i < vec.length; i++) {
            vec[i]=sc.nextInt();
        }
        
        burbuja(vec, vec.length);
        
        System.out.println(Arrays.toString(vec));
    }

}
