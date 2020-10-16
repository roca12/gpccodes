import java.util.Scanner;
public class Main{
    
    public static void main(String[] args){
        Scanner tc = new Scanner (System.in);   
        while (tc.hasNext()) {            
            int v = tc.nextInt();
            int t = tc.nextInt();
            int resultado = v * (t*2);
            System.out.println(resultado);
        }
    }
}
