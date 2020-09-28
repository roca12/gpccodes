import java.util.HashMap;

public class Main {

    public static void main(String[] args){
        HashMap<String, String> dicc= new HashMap<>();
        dicc.put("Programar", "Utilizacion de codigo para ejecutar un programa");
        dicc.put("vainazo", "lo que se tiran en el grupo de Discord");
        dicc.put("among us","juego para funar");
        dicc.put("Futbol", "Deporte con una pelota y arcos");
        dicc.put("Funar","Gritar como una loca(Diego cof cof)");
        for (String concepto: dicc.keySet()) {
			String key = concepto;
			String value = dicc.get(concepto);
			System.out.println(key+" = "+value);
		}
    }
}
