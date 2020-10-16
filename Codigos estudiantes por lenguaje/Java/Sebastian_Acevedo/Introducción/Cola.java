import java.util.Queue;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> cola = new LinkedList<>();
		for (int i=0; i<10; i++) {
			cola.offer(i);
		}
		while(!cola.isEmpty()) {
			System.out.println(cola.poll());
		}
	}
}
