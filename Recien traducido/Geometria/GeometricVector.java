
import java.awt.Point;
//Dados dos puntos A y B, crea el vector A->B. 
//Es llamado Vec para no confundirlo con vector 
//como colección de elementos.

public class GeometricVector {

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

    public static void main(String[] args) {
        Point a= new Point(0, 0);
        Point b= new Point(5, 5);
        Vec segmento = toVector(a, b);
    }
}
