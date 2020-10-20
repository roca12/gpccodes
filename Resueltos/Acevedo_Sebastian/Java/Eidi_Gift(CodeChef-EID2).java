import java.util.Scanner;
// Era not jaja

public class Main {
		
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int rep = sc.nextInt();
		 for (int i = 0; i < rep; i++) {
			int children[]= new int[3];
			for (int j = 0; j < 3; j++) {	
				int num = sc.nextInt();
				children[j]=num;
			}
			int money[]= new int[3];
			for (int j = 0; j < 3; j++) {
				int num = sc.nextInt();
				money[j]=num;
			}
			if(comp(children, money)==0)System.out.println("FAIR");
			else System.out.println("NOT FAIR");			
		}
	}    
	
	static int comp(int children[], int money[]) {
		int per1 = children[0]+money[0];
		int per2 = children[1]+money[1];
		int per3 = children[2]+money[2];
		if(children[0] == children[1]) {
			if(per1-per2!=0)return 1;
		}
		if(children[0] == children[2]) {
			if(per1-per3!=0)return 1;
		}
		if(children[2] == children[1]) {
			if(per3-per2!=0)return 1;
		}
		if(children[0] > children[1]) {
			if(money[0] <= money[1])return 1;
		}
		if(children[0] > children[2]) {
			if(money[0] <= money[2])return 1;
		}
		if(children[1] > children[2]) {
			if(money[1] <= money[2])return 1;
		}
		if(children[0] < children[1]) {
			if(money[0] >= money[1])return 1;
		}
		if(children[0] < children[2]) {
			if(money[0] >= money[2])return 1;
		}
		if(children[1] < children[2]) {
			if(money[1] >= money[2])return 1;
		}
		return 0;		
	}
}
