import java.util.*;
public class Main{
    public static void main (String[] arg){
        
        Scanner sc = new Scanner(System.in);       
        int c = sc.nextInt();     
        for(int i = 0 ; i < c ; i++) {           
            int x = sc.nextInt();
            int y = sc.nextInt();            
            int z = x%y;            
            System.out.println(z);    
        }    
        
    }
}