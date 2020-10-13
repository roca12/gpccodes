import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//Concatenaciones
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nombre = br.readLine();
		String frase = " le gusta el futbol";
		System.out.println(nombre + " es Crack");
		System.out.println(nombre + frase);
		
		//Cortar
		String completo = nombre + frase;
		completo = completo.substring(2, 7);
		//Corta desde la posicion 2 a la 7
		System.out.println(completo);
		
		//Contains
		if(frase.contains("gusta")) {
			System.out.println("existe");
		}else {
			System.out.println("no existe");
		}
		
		//endsWhit - Termina en
		if (frase.endsWith("futbol")) {
			System.out.println("termina");
		}else {
			System.out.println("no termina");
		}
		

	}

}
