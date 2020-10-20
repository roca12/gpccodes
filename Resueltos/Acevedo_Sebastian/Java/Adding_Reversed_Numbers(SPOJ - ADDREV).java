import java.util.Scanner;
public class Main {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int rep = sc.nextInt();
    for (int i = 0; i < rep; i++) {
    	long numero1 = sc.nextLong();
    	long numer02 = sc.nextLong();
    	long  resultado = (reverse(numero1)+reverse(numer02));
    	System.out.println(reverse(resultado));	
	}	
  }
    
    static long reverse(long numero) {
    	long resultado = 0;
    	while(numero > 0) {
    		resultado = resultado*10 + numero%10;
    		numero = numero/10;
    	}
    	return resultado;
    }
}
