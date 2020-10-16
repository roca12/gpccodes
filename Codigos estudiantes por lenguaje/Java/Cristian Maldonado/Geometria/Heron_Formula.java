public class Heron_Formula {

    public static void main(String[] args) {
        System.out.println(heron(1, 0, -1, 0, 0, 2));
    }

    static double heron(double x1, double y1, double x2,
            double y2, double x3, double y3) {
        double a = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double b = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
        double c = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double s = (a + b + c) / 2.0;
        double A = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return A;
    }
}
