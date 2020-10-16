import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nombre = "Daniel Cangrejo danielcangrejo10@gmail.com";
		//Replace es para solo un caracter
		//Cambia espacios por raya baja
		//Comillas sencillas ya que es solo un caracter
		nombre = nombre.replace(' ', '_');
		System.out.println(nombre);
		
		String nombre2 = "Daniel Cangrejo danielcangrejo10@gmail.com";
		//Comillas dobles por que es una cadena de caracteres
		//Cambia "daniel" por "_"
		nombre2 = nombre2.replace("daniel", "_");
		System.out.println(nombre2);
		
		
	}

}
