import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rep = sc.nextInt();
        for (int i = 0; i < rep; i++) {
            int repM = sc.nextInt();
            int saltos=0, caidas=0;
            int comp[] = new int[repM];
            for (int j = 0; j < repM; j++) {
                int walls = sc.nextInt();
                comp[j] = walls;
            }
            for (int j = 0; j < comp.length-1; j++) {
                if(comp[j] > comp[j+1]) {
                    caidas++;
                }
                if(comp[j] < comp[j+1]) {
                    saltos++;
                }
            }
            System.out.println("Case "+(i+1)+": "+ saltos +" "+ caidas);
        }        
    }
}
