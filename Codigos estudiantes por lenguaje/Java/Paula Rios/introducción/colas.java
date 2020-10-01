import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        Queue<Integer> cola=new LinkedList<>();
        for (int i=0; i<10; i++) {
            cola.offer(i);
        }
        while(!cola.isEmpty()){
            //.poll muestra el primer elemento de la cola y luego lo elimina
            System.out.println(cola.poll());
        }
    }
    
}
