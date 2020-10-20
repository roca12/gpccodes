import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        double lado1 = sc.nextDouble();
        double lado2 = sc.nextDouble();
        double lado3 = sc.nextDouble();
        double semiperimetro = (lado1 + lado2 + lado3)/2;
        double areaT = Math.sqrt(semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3));
        double rcirculoG = ((lado1*lado2*lado3)/4)/areaT;
        double rcirculoP = Math.sqrt(((semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3))/semiperimetro);
        double areaCP = Math.PI * Math.pow(rcirculoP, 2);
        double areaCG = Math.PI * (Math.pow(rcirculoG, 2));
        System.out.println(String.format("%.4f %.4f %.4f",areaCG-areaT,areaT-areaCP,areaCP));
        }
    }
}
