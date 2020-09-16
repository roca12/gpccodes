public class Number_Of_Digits_Factorial {

    static int findDigits(int n){
        if(n < 0){
            return 0;
        }
        if(n <= 1){
            return 1;
        }
        double digits = 0;
        for (int i = 2; i <= n; i++) {
            digits += Math.log10(i);
        }
        return (int) (Math.floor(digits)+1);
    }
    
    public static void main(String[] args) {
        System.out.println(findDigits(100));
    }   
}
