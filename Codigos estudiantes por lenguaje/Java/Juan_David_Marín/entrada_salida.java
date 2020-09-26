import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {

    static Random r = new Random();

    public static void main(String[] args) {
        Stack<String> pila = new Stack<>();
        for (int i = 0; i < 10; i++) {
            pila.push(String.valueOf(r.nextInt(100)));
        }
        while(!pila.isEmpty()){
            System.out.println("La persona arriba es "+pila.peek());
            System.out.println("Se salio "+pila.pop());

        }


    }
}