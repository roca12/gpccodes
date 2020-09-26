import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    static Random r = new Random();

    public static void main(String[] args) {
        Queue<String> cola =new LinkedList<>();
        cola.offer("Luciano Chavarria - 79291");
        cola.offer("cristian perez - 61551");
        cola.offer("Edwin Villarraga - 84604");
        while (!cola.isEmpty()) {            
            System.out.println("En la punta esta "+cola.peek());
            System.out.println("Atendi a "+cola.poll());
        }
        

    }
}