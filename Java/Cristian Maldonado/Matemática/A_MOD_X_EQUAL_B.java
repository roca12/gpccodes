public class A_MOD_X_EQUAL_B {

    static void modEquation(int a, int b) {
        if (a < b) {
            System.out.println("No hay solucion");
            return;
        }
        if (a == b) {
            System.out.println("Hay infinitas soluciones");
        }
        int count = 0;
        int n = a - b;
        int y = (int) Math.sqrt(a - b);
        for (int i = 1; i <= y; i++) {
            if(n % i == 0){
                if(n / i > b){
                    count++;
                    System.out.println(n / i);
                }
                if(i > b){
                    count++;
                    System.out.println(i);
                }
            }
        }
        if(y * y == n && y > b){
            count--;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int a = 32, b = 2;
        //21 % x = 5;
        modEquation(a, b);
    }
}
