
//Determina si un punto pt se encuentra en el polígono 
//P. Este polígono se define como un vector de puntos, 
//donde el punto 0 y n-1 son el mismo. 

import java.util.ArrayList;
import java.awt.Point;

public class PointtInPolygon {

    static boolean ccw(Point p, Point q, Point r) {
        return cross(toVector(p, q), toVector(p, r)) > 0;
    }

    static boolean inPolygon(Point pt, ArrayList<Point> P) {
        if (P.isEmpty()) {
            return false;
        }
        double sum = 0;
        for (int i = 0; i < P.size() - 1; i++) {
            if (ccw(pt, P.get(i), P.get(i + 1))) {
                sum += angle(P.get(i), pt, P.get(i + 1));
            } else {
                sum -= angle(P.get(i), pt, P.get(i + 1));
            }
        }
        if (Math.abs(Math.abs(sum) - 2 * Math.acos(-1.0)) < 1e-9) {
            return true;
        }
        return false;
    }

    static double cross(Vec a, Vec b) {
        return a.x * b.y - a.y * b.x;
    }

    static boolean collinear(Point p, Point q, Point r) {
        return Math.abs(cross(toVector(p, q), toVector(p, r))) < 1e-9;
    }

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
    
    public static void main(String[] args) {
        ArrayList<Point> polygon= new ArrayList<>();
        polygon.add(new Point(0, 0));
        polygon.add(new Point(2, 0));
        polygon.add(new Point(2, 2));
        polygon.add(new Point(0, 2));
        polygon.add(new Point(0, 0));
        Point punto = new Point(1, 1);
        if (inPolygon(punto, polygon)){
            System.out.println("Si");
        }else{
            System.out.println("No");
        }
    }
}
