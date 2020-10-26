import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {

    //Ciclo infinito con buffer

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// lectura rapida
        String inf;// string nulo para que realize la condicion del while y sea infinito
        while ((inf = br.readLine()) != null) {// while infinito con buferred
            StringTokenizer st = new StringTokenizer(inf);// dividir un string en substrings o tokens, en base a otro
            // string (normalmente un carácter) separador entre ellos
            // denominado delimitador.
            int n = Integer.parseInt(st.nextToken());
            System.out.println(n);

        }
    }
}

