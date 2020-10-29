import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nombre = "Daniel Cangrejo danielcangrejo10@gmail.com";
		for (int i = 0; i < nombre.length(); i++) {
			//charAt accede al string y con el for va imprimiendo cada letra 
			System.out.println(nombre.charAt(i));
		}
		
		
	}

}
