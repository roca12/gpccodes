public class Main {

    static double DegToRad(double d) {
        return d * Math.PI / 180.0;
    }

    static double RadToDeg(double r) {
        return r * 180.0 / Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(DegToRad(360));
        System.out.println(RadToDeg(6.283185307179586));
    }
}
