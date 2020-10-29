import java.util.Scanner;
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        while(number1!=0) {
            int suma=0;
            for (int i = 1; i < number1+1; i++) {
                int temp = i*i;
                suma = suma + temp;
            }
            System.out.println(suma);
            number1 = sc.nextInt();
        }
    }
