import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String nombre = "daniel cangrejo";
		//se va a separar cada vez que encuentre un " "
		String [] separacion = nombre.split(" ");
		for (String s : separacion) {
			System.out.println(s);
		}
		
		String nombre2 = "daniel-cangrejo";
		//se va a separar cada vez que encuentre un -
		String [] separacion2 = nombre2.split("-");
		for (String s : separacion2) {
			System.out.println(s);
		}

		//separando con lectura, sirve igualmente con numeros
		//ya que lee todo como una cadena de caracteres
		String [] separacion3 = br.readLine().split(" ");
		for (String s : separacion3) {
			System.out.println(s);
		}

	}

}
