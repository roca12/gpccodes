import java.util.Arrays;
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        int numM = sc.nextInt();
        while(numN != 0 && numM != 0) {
        	int arrN[] = new int[numN];
        	int arrM[] = new int[numM]; 
        	for (int i = 0; i < numN; i++) {
				int numer0sN = sc.nextInt();
				arrN[i]=numer0sN;
				
			}
        	for (int i = 0; i < numM; i++) {
        		int numer0sM = sc.nextInt();
				arrM[i]=numer0sM;
			}
        	Arrays.sort(arrN);
        	Arrays.sort(arrM);
        	int i=0, j=0;
        	int coins=0, count=0;
        	int n = arrN.length;
        	int m = arrM.length;
        	while(i<n && j<m) {
        		if(arrN[i] > arrM[j]) {
        			j++;
        		}else {      			
        			coins = coins + arrM[j];
        			count++;
        			j++;
        			i++;
        		}
        	}
        	if(count<n) System.out.println("Loowater is doomed!");
        	else System.out.println(coins);
        	
        	numN = sc.nextInt();
        	numM = sc.nextInt();
        }
    }
}
