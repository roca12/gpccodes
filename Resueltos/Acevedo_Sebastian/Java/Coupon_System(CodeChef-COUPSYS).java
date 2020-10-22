import java.util.Scanner;

public class Main {
	
	static final int[] lvl1 = {0,1};
	static final int[] lvl2 = {0,1};
	static final int[] lvl3 = {0,1};
	static void reboot() {
		lvl1[0]=0; lvl1[1]=1;
		lvl2[0]=0; lvl2[1]=1;
		lvl3[0]=0; lvl3[1]=1;
	}
	
	static void coupons(int city, int level, int discount) {
		if(level==1) {
			if(discount > lvl1[1]) {
				lvl1[1]=discount;
				lvl1[0]=city;
			}else if(discount == lvl1[1]){
				if(city < lvl1[0] || lvl1[0] ==0) {
					lvl1[1]=discount;
					lvl1[0]=city;
				}
			}
		}
		else if(level==2) {
			if(discount > lvl2[1]) {
				lvl2[1]=discount;
				lvl2[0]=city;
			}else if(discount == lvl2[1]){
				if(city < lvl2[0]  || lvl2[0] ==0) {
					lvl2[1]=discount;
					lvl2[0]=city;
				}
			}
		}
		else if(level==3) {
			if(discount > lvl3[1]) {
				lvl3[1]=discount;
				lvl3[0]=city;
			}else if(discount == lvl3[1]){
				if(city < lvl3[0]  || lvl3[0] ==0) {
					lvl3[1]=discount;
					lvl3[0]=city;
				}
			}
		}		
	}
	
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int rep = sc.nextInt();
		 for (int i = 0; i < rep; i++) {
			int caps = sc.nextInt();
			for (int j = 0; j < caps; j++) {				
				int city = sc.nextInt();
				int level = sc.nextInt();
				int discount = sc.nextInt();
				coupons(city, level, discount);				
			}
			if(lvl1[0] != 0) {
				System.out.println(lvl1[1]+" "+lvl1[0]);
			}
			if(lvl2[0] != 0) {
				System.out.println(lvl2[1]+" "+lvl2[0]);
			}
			if(lvl3[0] != 0) {
				System.out.println(lvl3[1]+" "+lvl3[0]);
			}
			reboot();
		}
	}    
}
