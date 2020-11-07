
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sca=new Scanner(System.in);
        int opc = sca.nextInt();
        for (int i = 0; i < opc; i++) {
            int invertido=0, resto;
            int num = sca.nextInt();
            while(num>0){
            resto = num % 10;
            invertido = invertido *10+resto;
            num /= 10;
        }
            System.out.println(invertido);
        }
        
        
    }
    
}
