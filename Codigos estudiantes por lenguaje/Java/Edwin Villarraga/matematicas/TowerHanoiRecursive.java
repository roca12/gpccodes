public class Main {

    public static void main(String[] args) {
            int n;
            n = 8;
            hanoi(n, "Primera torre", "Segunda torre", "Tercera torre");
        }
        static int paso = 1;
        static void hanoi(int n, String from, String temp, String to) {
            if (n == 0) {
                return;
            }
            hanoi(n - 1, from, to, temp);
            System.out.println(paso + " Mover disco " + n + " de " + from + " a " + to);
            paso++;
            hanoi(n - 1, temp, from, to);
        }
}
