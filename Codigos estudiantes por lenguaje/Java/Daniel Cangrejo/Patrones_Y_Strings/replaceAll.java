import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String nombre = "Daniel Cangrejo danielcangrejo10@gmail.com";
		//En "[]" va el rango de lo que se quiere cambiar por otras cosas
		//Cambia desde el rango de la a a la z por arrobas
		System.out.println(nombre.replaceAll("[a-z]", "@" ));
		//Niega la expresion con "^"
		//Cambia todo lo que no está en el rango por arrobas
		System.out.println(nombre.replaceAll("[^a-z]", "@" ));
		//cambia letras minusculas y numeros por arrobas
		System.out.println(nombre.replaceAll("[a-z0-9]", "@" ));
		//cambia letras minusculas numero letras mayusculas y espacios
		System.out.println(nombre.replaceAll("[a-z0-9A-Z ]", "@" ));
		//Cambia desde el número en ASCCI de la A mayúscula hasta
		//el número en ASCCI de la z minuscula 
		System.out.println(nombre.replaceAll("[A-z]", "@" ));
		
		
	}

}
