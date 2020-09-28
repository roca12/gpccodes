import java.util.Random;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		Queue<Persona> filabar = new LinkedList<>();
		Persona soachapte = new Persona("Edwin", 18, 'M');
        Persona soachapte2 = new Persona("Angie", 17, 'F');
        Persona ares = new Persona("Sebastian", 19, 'M');
        Persona persona88 = new Persona("Mateo", 22, 'M');
        Persona morktem = new Persona ("Yeison", 17, 'M');
        Persona personakrak = new Persona ("Daniel", 17, 'M');
        Persona yuls = new Persona ("yuliana", 19, 'F');
        Persona personax = new Persona ("Juano",19,'M');
        Persona personaprincipal = new Persona("Sebastian", 20, 'M');
        Persona coach = new Persona("Diego", 23, 'A');
        Persona impostora= new Persona("Laura",20,'F');
        Persona dm = new Persona ("Diana",19,'F');
        filabar.offer(soachapte);
        filabar.offer(soachapte2);
        filabar.offer(ares);
        filabar.offer(persona88);
        filabar.offer(morktem);
        filabar.offer(personakrak);
        filabar.offer(yuls);
        filabar.offer(personax);
        filabar.offer(personaprincipal);
        filabar.offer(coach);
        filabar.offer(impostora);
        filabar.offer(dm);
		
		while(!filabar.isEmpty()) {
			Persona actual = filabar.peek();
			if(actual.edad<18) {
				System.out.println(actual.nombre+" no entra al bar");
				filabar.remove();
			}else {
				System.out.println(actual.nombre+" entra al bar");
				filabar.poll();
			}
		}
	}
	static class Persona{
		String nombre;
		int edad;
		char sexo;
		public Persona(String nombre, int edad, char sexo) {
			this.nombre=nombre;
			this.edad = edad;
			this.sexo= sexo;
		}
	}
	
}
