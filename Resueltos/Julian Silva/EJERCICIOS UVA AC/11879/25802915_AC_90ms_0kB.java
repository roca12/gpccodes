import java.math.BigInteger;
import static java.math.BigInteger.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a, x;
         x=TEN.add(valueOf(7));
        while (sc.hasNext()) {
            a=sc.nextBigInteger();
            if(a.equals(ZERO)){
                break;
            }else if(a.mod(x)==ZERO){
                System.out.println("1");
                
            }else{
                System.out.println("0");
            }
        }
    }
}
