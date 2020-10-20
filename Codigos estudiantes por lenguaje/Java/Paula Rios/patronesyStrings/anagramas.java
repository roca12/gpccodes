public class Main {
 static final int MAX = 256;

    static boolean compare(char vec1[], char vec2[]) {
        for (int i = 0; i < MAX; i++) {
            if (vec1[i] != vec2[i]) {
                return false;
            }
        }
        return true;
    }

    static void search(String busqueda, String str) {
        int x = busqueda.length();
        int y = str.length();

        char[] conteopalabras = new char[MAX];
        char[] countTW = new char[MAX];
        for (int i = 0; i < x; i++) {
            (conteopalabras[busqueda.charAt(i)])++;
            (countTW[str.charAt(i)])++;
        }
        for (int i = x; i < y; i++) { 
            if (compare(conteopalabras, countTW)) {
                System.out.println("Encontrado en indice " + (i - x)+"-"+(i-1));
            }
            (countTW[str.charAt(i)])++;
            countTW[str.charAt(i - x)]--;
        }
        if (compare(conteopalabras, countTW)) {
        System.out.println("Encontrado en indice " + (y - x)+"-"+(y-1));
    }

}
    public static void main(String args[]) {
        String str = "anitalavalatina";
        String busqueda = "vala";
        search(busqueda, str);
    }
}
