  
import java.util.*;

public class Main {
    public static void main(String[] args) {
    	double cont =1;
    	ArrayList<ArrayList<Double>> matrix=new ArrayList<>();
    	for (int i = 0; i < 8; i++) {
			matrix.add(new ArrayList<>());
		}
    	for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				matrix.get(i).add(cont);
				cont++;
			}
		}
    	for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(matrix.get(i).get(j)+"\t");
			}
			System.out.println("");
		}
  }
}
