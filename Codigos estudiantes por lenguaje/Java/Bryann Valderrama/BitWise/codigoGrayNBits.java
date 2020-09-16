import java.util.ArrayList;

public class Main {

    static void generateGrayarr(int n) {
        // Caso base
        if (n <= 0) {
            return;
        }
        // 'arr' podria almacenar todos los codigos generados 
        ArrayList<String> arr = new ArrayList<String>();
        // Comienza con un patron de un bit 
        arr.add("0");
        arr.add("1");
        /*Cada iteracion de este ciclo genera 2i codigos desde los 
        i codigos generados previamente*/
        int i, j;
        for (i = 2; i < (1 << n); i = i << 1) {
        
            for (j = i - 1; j >= 0; j--) {
                arr.add(arr.get(j));
            }

            for (j = 0; j < i; j++) {
                arr.set(j, "0" + arr.get(j));
            }

            for (j = i; j < 2 * i; j++) {
                arr.set(j, "1" + arr.get(j));
            }
        }
        for (i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        generateGrayarr(5);
    }
}
