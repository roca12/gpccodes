import java.io.IOException;
import java.util.Arrays;

import java.util.Scanner;

public class List_adyace {
   static int G[][];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		    int V,E;
		    V=sc.nextInt();
		    E=sc.nextInt();
		    G=new int[V][V];
		    for(int i=0;i<E;++i){
		        int desde,hasta,peso;
		        desde=sc.nextInt();
		        hasta=sc.nextInt();
		        peso=sc.nextInt();
		        G[desde][hasta]=peso;
		        G[hasta][desde]=peso;
		    }
		    for(int i=0;i<V;++i){
		        for(int j=0;j<V;++j){
		        	System.out.print(G[i][j]+"\t");
		        }
		        System.out.println();
		    }
	}
}
