public class Number_Of_Digits_Factorial_Optimized {

    static double M_E = 2.71828182845904523536;
    static double M_PI = 3.141592654;
    
    static long findDigits(int n){
        if(n < 0){
            return 0;
        }
        if(n <= 1){
            return 1;
        }
        double x = (n * Math.log10(n / M_E)+ Math.log10(2 * M_PI * n) / 2.0);
        return (long) Math.floor(x) + 1;
    }
    
    public static void main(String[] args) {
        System.out.println(findDigits(1));
        System.out.println(findDigits(50000000));
        System.out.println(findDigits(1000000000));
        System.out.println(findDigits(120));
    }    
}
