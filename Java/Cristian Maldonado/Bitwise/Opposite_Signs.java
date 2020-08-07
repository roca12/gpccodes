public class Opposite_Signs {

    static boolean opposite(int a, int b){
        return (a ^ b) < 0;
    }
    
    public static void main(String[] args) {
       int a = 123;
       int b = -123;
       if(opposite(a, b)){
           System.out.println("Distintos signos");
       }else{
           System.out.println("Iguales signos");
       }
    }   
}
