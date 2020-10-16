import java.util.Scanner;
public class Main
{
 enum Medida {
        CM("CENTIMETROS", 100.0),
        FT("PIES",  3.28084),
        MM("MILIMETROS",  1000.0),
        IN("PULGADAS",  39.3701),
        YD("YARDAS",  1.09361),
        LY("AÑOS LUZ",  1.057e-16),
        A("ANGSTROMS",  1e+10);

        private String nombre;
        private Double cantidad;

        Medida(String nombre, Double cantidad) {
            this.nombre = nombre;
            this.cantidad = cantidad;
        }

        private Double convertirMetrosAMedida(Double metros) {
            return metros * cantidad;
        }

        public String mensajeMetrosAMedida(Double metros) {
            Double resultadoTransformacion = convertirMetrosAMedida(metros);
            return metros + " metros en " + nombre  + " es igual a " + resultadoTransformacion;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de transformación de metros a centimetros, milimetros, " +
                "pies, pulgadas, yardas, años luz y angstroms.");
        System.out.println("Escriba la longitud en metros");
        double metros = sc.nextDouble();
        System.out.println("Los valores de medida de " + metros + " en otras medidas es:");
        System.out.println(Medida.CM.mensajeMetrosAMedida(metros));
        System.out.println(Medida.FT.mensajeMetrosAMedida(metros));
        System.out.println(Medida.MM.mensajeMetrosAMedida(metros));
        System.out.println(Medida.IN.mensajeMetrosAMedida(metros));
        System.out.println(Medida.YD.mensajeMetrosAMedida(metros));
        System.out.println(Medida.LY.mensajeMetrosAMedida(metros));
        System.out.println(Medida.A.mensajeMetrosAMedida(metros));

    }
}