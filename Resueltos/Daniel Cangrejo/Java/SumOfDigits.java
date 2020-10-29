import java.util.Scanner;
import java.math.BigInteger;
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num1 = sc.nextBigInteger();
        BigInteger num2 = sc.nextBigInteger();
        while (num1.equals(BigInteger.ZERO) ==false && num2.equals(BigInteger.ZERO) ==false) {
            System.out.println(num1.modPow(num2, BigInteger.TEN));
            num1 = sc.nextBigInteger();
            num2 = sc.nextBigInteger();
        }
    }
}
