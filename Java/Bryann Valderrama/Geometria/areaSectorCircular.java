import java.util.*;

public class Main {
    static void sectorArea(double radio, double angulo) {
        if (angulo >= 360) {
            System.out.println("el angulo no es posible");
        } else {
            double sector = ((22 * radio * radio) / 7) * (angulo / 360);
            System.out.println(sector);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double radio = sc.nextDouble();
        double angulo = sc.nextDouble();
        sectorArea(radio, angulo);
    }
}
