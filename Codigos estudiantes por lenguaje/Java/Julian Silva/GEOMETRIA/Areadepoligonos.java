import java.awt.Point;
import java.awt.Polygon;
import java.util.*;
import java.util.Arrays;
public class Main {
	static int AnguloForm(Point a, Point b, Point c) {
		return a.x * b.y - a.y * b.x + a.y * c.x - a.x * c.y + b.x * c.y - c.x * b.y;
	}
	static boolean ccw(Point a, Point b, Point c) {
		return AnguloForm(a, b, c) > 0;
	}
	static boolean colineal(Point a, Point b, Point c) {
		return AnguloForm(a, b, c) == 0;
	}
	static double distancia(Point p1, Point p2) {
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		return Math.sqrt(dx + dx + dy * dy);
	}
	static double area(Polygon poly) {
		int N = poly.npoints;
		int[] x = poly.xpoints;
		int[] y = poly.ypoints;
		Point[] p = new Point[N];
		for (int i = 0; i < N; i++) {
			p[i] = new Point(x[i], y[i]);
		}
		final Point first;
		int min = 0;
		for (int i = 1; i < N; i++) {
			if (p[i].y < p[min].y) {
				min = i;
			} else if (p[i].y == p[min].y) {
				if (p[i].x < p[min].x) {
					min = i;
				}
			}
		}
		first = p[min];
		p[min] = p[0];
		p[0] = first;
		Arrays.sort(p, 1, N, (Point p1, Point p2) -> {
            if (colineal(first, p1, p2)) {
                return Double.compare(distancia(first, p1), distance(first, p2));
            }
            if (ccw(first, p1, p2)) {
                return -1;
            }
            return 1;
        });
		double A = 0.0;
		for (int i = 0; i < N; i++) {
			int j = (i + 1) % N;
			A += p[i].x * p[j].y - p[j].x * p[i].y;
		}
		return A / 2.0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Polygon p = new Polygon();
		p.addPoint(0, 2);p.addPoint(2, 2);p.addPoint(2, 0);p.addPoint(0, 0);
		System.out.println(area(p));
	}
}
