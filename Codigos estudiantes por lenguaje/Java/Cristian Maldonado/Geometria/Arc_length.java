public class Arc_Length {

    static double arcLength(double diameter, double angle) {
        double pi = 22.0 / 7.0;
        double arc;
        if (angle >= 360) {
            System.out.println("Angulo no puede ser formado");
            return 0;
        } else {
            arc = (pi * diameter) * (angle / 360.0);
            return arc;
        }
    }

    public static void main(String[] args) {
        double diameter = 25.0;
        double angle = 45.0;
        double arc_len = arcLength(diameter, angle);
        System.out.println(arc_len);
    }
}
