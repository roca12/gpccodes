public class Circumscribed_Circle_Of_Equilateral {

    static double PI = 3.14159265;

    public static double area_cicumscribed(double a) {
        return (a * a * (PI / 3));
    }

    public static void main(String[] args) {
        double a = 6.0;
        System.out.println("Area of circumscribed circle is :"
                + area_cicumscribed(a));
    }
}
