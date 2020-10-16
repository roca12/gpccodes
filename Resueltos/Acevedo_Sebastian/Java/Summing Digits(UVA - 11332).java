import java.util.Scanner;

public class Main{
    
	static long digit(long numero) {
		long suma=0;
		while (numero > 0) {
            suma = suma + numero % 10;
            numero /= 10;
        }
		return suma;
	}
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long numero = sc.nextLong();
        while(numero!=0) {
        	while(numero>9) {
        		numero = digit(numero);
        	}
        	System.out.println(numero);
        	numero = sc.nextLong();
        }
    }
}
