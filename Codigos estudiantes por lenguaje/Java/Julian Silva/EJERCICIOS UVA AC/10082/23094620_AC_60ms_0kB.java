import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s, tec;
        tec = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        while (sc.hasNext()) {
            s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    System.out.print(" ");
                } else {
                    System.out.print(tec.charAt(tec.indexOf(s.charAt(i)) - 1));
                }
            }
            System.out.println();
        }
    }
}
