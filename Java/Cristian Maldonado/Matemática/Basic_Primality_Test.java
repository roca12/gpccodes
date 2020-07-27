//Tener en cuenta que el algoritmo puede ser
//demasiado lento con una cantidad de consultas considerable
public class Primality_Test {

   static boolean isPrime(int x){
       if(x < 2){
           return false;
       }
       if(x == 2){
           return true;
       }
       if(x % 2 == 0){
           return false;
       }
       for (int i = 3; i * i <= x; i++) {
           if(x % i == 0){
               return false;
           }
       }
       return true;
   }
    
    public static void main(String[] args) {
        int n = 14;
        if(isPrime(n)){
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }
    }   
}
