//Calcula el area de un polígono representado como un 
//ArrayList de puntos. 
//IMPORTANTE: Definir P[0] = P[n-1] para cerrar el polígono. 
//El algorítmo utiliza el metodo de determinante 
//de la matriz de puntos de la figura. 

import java.util.ArrayList;
import java.awt.Point;



public class Area {

    public static double area(ArrayList<Point> P) {
        double result = 0.0;
        for (int i = 0; i < P.size() - 1; i++) {
            result += ((P.get(i).x * P.get(i + 1).y) - (P.get(i + 1).x * P.get(i).y));
        }
        return Math.abs(result) / 2.0;
    }
    public static void main(String[] args) {
        ArrayList<Point> puntos = new ArrayList<>();
        //los puntos deben ir en orden
        puntos.add(new Point(0, 0));
        puntos.add(new Point(0, 1));
        puntos.add(new Point(1, 1));
        puntos.add(new Point(1, 0));
        //Definir el ultimo punto igual que el primero para cerrar el poligono
        puntos.add(new Point(0, 0));
        System.out.println(area(puntos));
    }
}