import java.util.Random;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Random r=new Random();
       Stack<Double>pila=new Stack<>();
        for (int i=0; i<10; i++) {
           double numero=r.nextDouble();
            System.out.println(numero);
            pila.push(numero);
        }
        while(!pila.isEmpty()){
            //.pop muestra el primer elemento de la pila y luego lo elimina
            System.out.println(pila.pop());
        }
    }
    
}
