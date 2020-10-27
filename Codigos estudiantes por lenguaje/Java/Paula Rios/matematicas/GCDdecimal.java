public class Main {
    static double gcd(double a, double b){
      if(a<b){
          return gcd(b,a);
      }
      if(Math.abs(b)<0.001){
          return a;
      }else{
          return(gcd(b,a-Math.floor(a/b)*b));
      }
    }
    public static void main(String[] args) {
     double a=1.20,b=22.5;
        System.out.printf("%1.1f",gcd(a,b));
    }
    
}
