import java.util.Scanner;  

public class Main {  
      public static void main(String[] args) {  
           Scanner sc = new Scanner(System.in);  
           String str;  
           boolean y = true;  
           while(sc.hasNextLine()) {  
                str = sc.nextLine();  
                for(int i = 0; i < str.length(); i++) {  
                     if(str.charAt(i) == '\u001a')  
                          break;  
                     
                     if(str.charAt(i) == '\"') {  
                          if(y == true) {  
                               System.out.print("``");  
                               y = false;  
                               continue;  
                          } else {  
                               System.out.print("''");  
                               y = true;  
                               continue;  
                          }  
                     }  
                     System.out.print(str.charAt(i));  
                }  
                System.out.print("\n");       
           }  
      }  
 }