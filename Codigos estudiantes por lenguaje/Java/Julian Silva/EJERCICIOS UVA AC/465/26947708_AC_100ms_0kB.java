import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            String c = sc.next();
            String max = "2147483647";
            BigInteger x = new BigInteger(a);
            BigInteger y = new BigInteger(c);
            BigInteger maximo = new BigInteger(max);
            System.out.println(a + " " + b + " " + c);
            if(x.compareTo(maximo)>0){
                System.out.println("first number too big");
            }
            if(y.compareTo(maximo)>0){
                System.out.println("second number too big");
            }
            BigInteger total =BigInteger.ZERO;
            if(b.equals("+")){
                total = x.add(y);
            }
            else{
                total = x.multiply(y);
            }
            if(total.compareTo(maximo)>0){
                System.out.println("result too big");
            }
        }
    }
}