import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n1 = sc.nextBigInteger();
        BigInteger n2 = sc.nextBigInteger();
        System.out.println(n1.add(n2));//Suma
        System.out.println(n1.subtract(n2)); //Resta
        System.out.println(n1.divide(n2)); //División 
        System.out.println(n1.multiply(n2)); //Multiplicación
        System.out.println(n1.pow(2)); // Potencia - la potencia tiene que ser entero
        System.out.println(n1.toString(16)); // Lo Cambia a Hexadecimal
        n1 = n1.ZERO; // Inicializar en 0
        n1 = n1.ONE; // Inicializar en 1
       
        //BigDecimal
        BigDecimal n3 = sc.nextBigDecimal();
        BigDecimal n4 = sc.nextBigDecimal();
        System.out.println(n3.add(n4));
        
        
    }
    
}
