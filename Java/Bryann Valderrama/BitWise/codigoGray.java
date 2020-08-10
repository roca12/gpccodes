public class Main {

    static String binarytoGray(String binary) {
        String gray = "";
        gray += binary.charAt(0);
        for (int i = 1; i < binary.length(); i++) {
            gray += xor_c(binary.charAt(i - 1), binary.charAt(i));
        }
        return gray;
    }

    static char xor_c(char a, char b) {
        return a == b ? '0' : '1';
    }

    static String graytobinary(String gray) {
        String binary = "";
        binary += gray.charAt(0);
        for (int i = 1; i < gray.length(); i++) {
            if (gray.charAt(i) == '0') {
                binary += binary.charAt(i - 1);
            } else {
                binary += flip(binary.charAt(i - 1));
            }
        }
        return binary;
    }

    static char flip(char c) {
        return c == '0' ? '1' : '0';
    }

    public static void main(String[] args) {
        String b1 = "01001";
        String res = binarytoGray(b1);
        System.out.println(b1 + " -> " + res);
        String res2 = graytobinary(res);
        System.out.println(res + " -> " + res2);
    }
}
