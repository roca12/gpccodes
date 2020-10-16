public class Area_Circular_Sector {

    static void sectorArea(double radius, double angle){
        if(angle >=360){
            System.out.println("Angulo no posible");
        }else{
            double sector = ((22 * radius * radius) / 7) * (angle / 360);
            System.out.println(sector);
        }
    }
    public static void main(String[] args) {
        double radius = 9;
        double angle = 60;
        sectorArea(radius, angle);
    }
}
