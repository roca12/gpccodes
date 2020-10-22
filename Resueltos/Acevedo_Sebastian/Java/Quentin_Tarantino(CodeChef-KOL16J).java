import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		 HashSet<Integer> set = new HashSet<>();
		 Scanner sc = new Scanner(System.in);
		 int rep = sc.nextInt();
		 for (int i = 0; i < rep; i++) {
			int caps = sc.nextInt();
			int aux=0, aux2=0, op=0,temp=1;
			for (int j = 0; j < caps; j++) {				
				int nums = sc.nextInt();
				if(set.add(nums)) {
					aux+=j+1;
					aux2+=nums;					
				}else {
					op=1;
				}
				if(nums >= temp && temp!=-1) {
					op=1;
					temp=nums;
				}
				else {
					op=0;
					temp= -1;
				}
				
			}
			set.clear();
			if(aux != aux2 || op==1) System.out.println("no");
			else System.out.println("yes");			
		}
	}    
}
