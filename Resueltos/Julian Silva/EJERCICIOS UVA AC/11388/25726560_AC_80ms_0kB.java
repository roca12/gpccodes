
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1,num2,c;
        c=sc.nextInt();
        for (int i = 0; i < c; i++) {
            num1=sc.nextInt();
            num2=sc.nextInt();
            if(num2%num1==0){
                System.out.println(num1+" " +num2 );
            }else{
                System.out.println("-1");
            }
        }
    }
    
}
