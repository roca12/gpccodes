import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int []num = new int [T]; 
		for(int i=0; i<T; i++) {
			int x = sc.nextInt();
			int aux= comp(x);
			num[i]=aux;
		}
        for(int i=0; i<num.length; i++) {
        	System.out.println(num[i]);
        }  
    }
	
	static int comp(int x) {
		int resultado=0, m=0;
        m= x-45;
        while(m<x){
        int xd = sumdig(m);
        if((xd+m)==x && resultado==0)resultado=m;
        m++;
		}
		return resultado;
	}
	
	static int sumdig(int x) {
        int aux = 0;
        int suma=0;
        while (x > 0) {
            aux =  x % 10;
            x /= 10;
            suma =suma+ aux;
        }
        return suma;
    }
}
