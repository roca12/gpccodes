import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaRapida {

    public static void main(String[] args) throws IOException {
//objeto lector
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numeroentero;
        long numeroenterolargo;
        float numerodecimal;
        double numerodecimallargo;
        char caracter;
        String cadena;
        byte bits;
//Lectura como cadena y conversión a tipo
        numeroentero = Integer.parseInt(br.readLine());
        numeroenterolargo = Long.parseLong(br.readLine());
        numerodecimal = Float.parseFloat(br.readLine());
        numerodecimallargo = Double.parseDouble(br.readLine());
        caracter = br.readLine().charAt(0);
        cadena = br.readLine();
        bits = Byte.parseByte(br.readLine());
//impresion con formato
        System.out.printf("%d \n", numeroentero);
        System.out.printf("%d \n", numeroenterolargo);
        System.out.printf("%f \n", numerodecimal);
        System.out.printf("%e \n", numerodecimal);
        System.out.printf("%f \n", numerodecimallargo);
        System.out.printf("%e \n", numerodecimallargo);
        System.out.printf("%s \n", caracter);
        System.out.printf("%s \n", cadena);
        System.out.printf("%s \n", bits);

        /*
         ==============
         Formateadores
         ==============
         %d ó %i	entero en base 10 con signo (int)
         printf ("el numero enteronen base 10 es: %d" , -10);

         %u	entero en base 10 sin signo (int)
         %o	entero en base 8 sin signo (int)
         %x	entero en base 16, letras en minúscula (int)
         %X	entero en base 16, letras en mayúscula (int)
         %f	Coma flotante decimal de precisión simple (float)
         %lf	Coma flotante decimal de precisión doble (double)
         %ld	Entero de 32 bits (long)
         %lu	Entero sin signo de 32 bits (unsigned long)
         %e	La notación científica (mantisa / exponente), minúsculas (decimal precisión simple ó doble)
         %E	La notación científica (mantisa / exponente), mayúsculas (decimal precisión simple ó doble)
         %c	carácter (char)
         %s	cadena de caracteres (string)
        
         ==========
         Truncamiento
         ==========
         %07i	        justificado a la derecha, 7 dígitos de largo, sin relleno
         %.7i	        largo mínimo de 7 dígitos, justificado a la derecha, rellena con ceros
         %8.2f	        tamaño total de 8 dígitos, con dos decimales
         %.*f”',x,d)	tamaño predeterminado,x números decimales
         %*.*f”,x,y,d)	tamaño igual a x, y números decimales
         %s	        cadena terminada en null
         %5s	        primeros cinco caracteres o delimitador
         %.5s	        primeros cinco caracteres, sin tener en cuenta el delimitador
         %20.5s  	primeros cinco caracteres, justificados a la derecha, con 20 caracteres de largo
         %-20.5s	primeros cinco caracteres, justificados a la izquierda, con 20 caracteres de largo
         */
    }
}
