//Halla la distancia euclideana de 2 puntos en dos dimensiones (x,y). Para usar el primer método, debe definirse previamente la clase Point

import java.awt.Point;

public class EuclideanDistance {

    /*Trabajando con la clase Point*/
    static double euclideanDistance(Point p1, Point p2) {
        return Math.hypot(p1.x - p2.x, p1.y - p2.y);
    }

    /*Trabajando con los valores x y y de cada punto*/
    static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.hypot(x2 - x1, y2 - y1);
    }

    public static void main(String[] args) {
        System.out.println(euclideanDistance(new Point(0, 0), new Point(20, 20)));
        System.out.println(euclideanDistance(0, 0, 20, 20));
    }

}
