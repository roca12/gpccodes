public class Line_Through_Two_Points {

    public static void main(String[] args) {
        Pair P = new Pair(3, 2);
        Pair Q = new Pair(2, 6);
        lineFromPoints(P, Q);
    }

    static void lineFromPoints(Pair P, Pair Q) {
        double a = Q.second - P.second;
        double b = P.first - Q.first;
        double c = a * (P.first) + b * (P.second);
        if (b < 0) {
            System.out.println("La linea que pasa a traves de "
                    + "los puntos P y Q es: "
                    + a + "x " + b + "y = " + c);
        } else {
            System.out.println("La linea que pasa a traves de l"
                    + "os puntos P y Q es: "
                    + a + "x + " + b + "y = " + c);
        }
    }

    static class Pair {

        int first;
        int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
