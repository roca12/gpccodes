import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        long matrix[][]=new long[3][3];
        int cont=1;
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++){
                matrix[i][j]=cont;
                cont++;
            }
        }
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println("");
        }
            
    }   
}
