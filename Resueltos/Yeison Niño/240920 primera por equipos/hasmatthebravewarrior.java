import java.util.Scanner;



public class Main{
    
    public static void main(String[] args){
        Scanner tc = new Scanner (System.in);   
        while (tc.hasNext()) {            
            long num1 = tc.nextLong();
            long num2 = tc.nextLong();
        
        
            if (num1>num2) {
                long resultado = num1 - num2;
                System.out.println(resultado);
            } else {
                long resultado = num2 - num1;
                System.out.println(resultado);
            }
        }
        
        
    }
}
