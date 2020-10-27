
public class Main {
	
	static boolean[] divisibility(int num) {
		String M = String.valueOf(num);
		//pasa a String la la parte entera de num
		int n = M.length();
		int sum = 0;
		boolean[] isMultipleOf = new boolean[13];
		for (char c : M.toCharArray()) {
			sum+=c-'0';
			//resta el valor del numero en ASCCI
			//con el valor de 0 en ASCCI
			//Ejemplo: 5 --- 5: 53 - 0: 48 = 5
		}
		int lastdigit = M.charAt(n-1)-'0';
		//Almacena el último dígito
		isMultipleOf[1] = true;//Todos los números son multiplos de 1
		isMultipleOf[2] = lastdigit%2==0;
		isMultipleOf[3] = sum%3 == 0;
		if(n>1) { //si hay más de un digito
		    isMultipleOf[4] = Integer.parseInt(M.substring(n-2, n))%4 == 0;
		    //si los dos últimos números modular 4 es 0 es múltiplo de 4
		}else { //si solo hay un digito
			isMultipleOf[4] = lastdigit%4==0;
		}
		isMultipleOf[5] = lastdigit==0 || lastdigit==5;
		//Es multiplo de 5 si termina en 0 o 5
		isMultipleOf[6] = isMultipleOf[2] && isMultipleOf[3];
		//Es multiplo de 6 si es divisible por 2 y por 3
		
		int altSum = 0;
		int j = 0;
		int [] patron = {1,3,2,-1,-3,-2};
		for (int i = n-1; i >= 0; i--) {
			altSum+=patron[j]*(M.charAt(i))-'0';
			j = (j+1)%6;
		}
		isMultipleOf[7] = Math.abs(altSum)%7 == 0;
		//Es divisible si la suma alterna modular 7 es igual a 0;
		
		if(n>2) {//Si tiene 3 digitos
			isMultipleOf[8] = Integer.parseInt(M.substring(n-3,n))%8==0;
			//Es multiplo de 8 si los últimos 3 dígitos modular 8 es 0
		}else {
			isMultipleOf[8] = Integer.parseInt(M)%8==0;
		}
		
		isMultipleOf[9] = sum%9==0;
		//Es divisible por 9 si la suma de sus digitos modular 9 es igual a 0
		
		isMultipleOf[10] = lastdigit==0;
		//Es divisible por 10 si termina en 0
		
		isMultipleOf[11] = Math.abs(altSum)%11==0;
		//Es multiplo de 11 si el valor absoluto de la suma alterna
		//de sus digitos modular 11 es igual a 8
		
		isMultipleOf[12] = isMultipleOf[3] && isMultipleOf[4];
		//Es multiplo de 12 si es divisible por 3 y 4
		return isMultipleOf;
		
	} 
			
	
	public static void main(String[] args) {
		boolean[] res = divisibility(1024);
		for (int i = 1; i < res.length; i++) {
			System.out.println(i + " " + res[i]);
		}
	}
}
