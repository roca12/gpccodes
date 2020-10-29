import java.util.Scanner;

public class Main {
    
    static long operacionesA(long A, long limite, long cont){
        
        if(A==1) {
            cont++;
            return cont;
            
        }else if(A > limite) {
            cont++;
            return cont-1;
    
        }else{
            cont++;
            if(A % 2 == 0) {
                A = A/2;
                
                return operacionesA(A, limite, cont);
            }else {
                A = (A*3) + 1;
                return operacionesA(A, limite, cont);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caso = 0;
        while(caso!=-1) {
            long A = sc.nextLong();
            long lim = sc.nextLong();
            long cont = 0;
            caso++;
            if(A>-1 && lim>-1) {
                cont = operacionesA(A, lim, cont);
                System.out.println("Case " + caso + ": " + "A = " + A + ", limit = " + lim + ", number of terms = " + cont);
            }
            else caso=-1;    
        }     
    }
}
