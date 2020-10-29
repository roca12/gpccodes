import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> listadoblelazo = new LinkedList<>();
		for (int i = 0; i < 20; i++) {
			if (i%2 == 0) {
				listadoblelazo.addFirst(i);
			} else {
				listadoblelazo.addLast(i);
			}
		}
		for (Integer i : listadoblelazo) {
			System.out.print(i + " ");
		}

	}

}
