import java.util.*;

public class Main {

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int orientation(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x)
                - (q.x - p.x) * (r.y - q.y);
        if (val == 0) {
            return 0;
        }
        return (val > 0) ? 1 : 2; 
    }


    static void convexHull(Point points[], int n) {
        if (n < 3) {
            return;
        }

        ArrayList<Point> hull = new ArrayList<>();

        int l = 0;
        for (int i = 1; i < n; i++) {
            if (points[i].x < points[l].x) {
                l = i;
            }
        }

        int p = l, q;
        do {
            hull.add(points[p]);

            q = (p + 1) % n;
            for (int i = 0; i < n; i++) {

                if (orientation(points[p], points[i], points[q])
                        == 2) {
                    q = i;
                }
            }

            p = q;
        } while (p != l);
        for (Point temp : hull) {
            System.out.println("(" + temp.x + ", "
                    + temp.y + ")");
        }
    }

    public static void main(String[] args) {
        Point points[] = new Point[7];
        points[0] = new Point(0, 3);
        points[1] = new Point(2, 3);
        points[2] = new Point(1, 1);
        points[3] = new Point(2, 1);
        points[4] = new Point(3, 0);
        points[5] = new Point(0, 0);
        points[6] = new Point(3, 3);
        int n = points.length;
        convexHull(points, n);
    }
}
