//Calcula el perímetro de un polígono representado 
//como un vector de puntos. 
//IMPORTANTE: Definir P[0] = P[n-1] para cerrar el polígono. 
//La estructura point debe estar definida, al igual que el
//método euclideanDistance.

import java.util.ArrayList;
import java.awt.Point;

public class Perimeter {

    public static double perimeter(ArrayList<Point> P) {
        double result = 0.0;
        for (int i = 0; i < P.size() - 1; i++) {
            result += euclideanDistance(P.get(i), P.get(i + 1));
        }
        return result;
    }

    /*Trabajando con la clase Point*/
    static double euclideanDistance(Point p1, Point p2) {
        return Math.hypot(p1.x - p2.x, p1.y - p2.y);
    }

    /*Trabajando con los valores x y y de cada punto*/
    static double euclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.hypot(x2 - x1, y2 - y1);
    }

    public static void main(String[] args) {
        ArrayList<Point> polygon = new ArrayList<>();
        polygon.add(new Point(0, 0));
        polygon.add(new Point(1, 0));
        polygon.add(new Point(1, 1));
        polygon.add(new Point(0, 1));
        polygon.add(new Point(0, 0));
        System.out.println(perimeter(polygon));
    }
}
