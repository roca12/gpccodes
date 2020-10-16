public class Line_Mid_Point {

    static void midpoint(int x1, int x2,
            int y1, int y2) {
        System.out.print((x1 + x2) / 2
                + " , " + (y1 + y2) / 2);
        System.out.println("");
    }

    public static void main(String[] args) {
        int x1 = -1, y1 = 2;
        int x2 = 3, y2 = -6;
        midpoint(x1, x2, y1, y2);
    }
}
