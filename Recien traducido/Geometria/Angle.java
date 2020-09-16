//Dados 3 puntos A, B, y C, determina el valor del angulo ABC (origen en B) 
//en radianes. 
//Si se desea convertir a grados sexagesimales, 
//revisar degrees and radians.
import java.awt.Point;
public class Angle {

    static double angle(Point a, Point b, Point c) {
        Vec ba = toVector(b, a);
        Vec bc = toVector(b, c);
        return Math.acos((ba.x * bc.x + ba.y * bc.y) / Math.sqrt((ba.x * ba.x + ba.y * ba.y) * (bc.x * bc.x + bc.y * bc.y)));
    }

    static class Vec {
        public double x, y;
        public Vec(double _x, double _y) {
            this.x = _x;
            this.y = _y;
        }
    }

    static Vec toVector(Point a, Point b) {
        return new Vec(b.x - a.x, b.y - a.y);
    }

    static double DegToRad(double d) {
        return d * Math.PI / 180.0;
    }

    static double RadToDeg(double r) {
        return r * 180.0 / Math.PI;
    }

    public static void main(String[] args) {
        Point[] puntos = new Point[]{new Point(0, 0),
            new Point(1, 0), new Point(0, 1)};
        double res=angle(puntos[0], puntos[1], puntos[2]);
        System.out.println(res);
        System.out.println(RadToDeg(res));
    }

}
