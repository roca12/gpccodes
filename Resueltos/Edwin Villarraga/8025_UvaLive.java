import java.math.*;
import java.util.*;
import java.util.Locale.Category;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int c=sc.nextInt();
		TreeMap<Double, String> tree_map = new TreeMap<Double, String>(); 
		for (int i = 0; i < c; i++) {
			String a=sc.next();
			String b=sc.next();
			double number;
			boolean b1 = Character.isDigit(a.charAt(0));
			if(b1==true) {
				number=Double.parseDouble(a);
				number/=2;
				tree_map.put(number, b);
			}else{
				number=Double.parseDouble(b);
				tree_map.put(number, a);
			}
		}
		 String prueba = tree_map.values().toString();
		 prueba = prueba.replace("[", "");
		 prueba = prueba.replace("]", "");
		 prueba = prueba.replace(",","\n");
		 prueba = prueba.replace(" ","");
		 System.out.println(prueba);
		}
	}
}
