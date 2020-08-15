import java.util.;

public class Main {

    static double ArcLength(double diametro, double angulo) {
        double pi= Math.PI;
        double arc;
        if(angulo>=360) {
            System.out.println("El angulo no puede ser formado");
            return 0;
        }else {
            arc=(pidiametro)*(angulo/360.0);
            return arc;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double diametro=sc.nextDouble();
        double angulo=sc.nextDouble();
        double arc_len=ArcLength(diametro, angulo);
        System.out.println(arc_len);
    }
}
