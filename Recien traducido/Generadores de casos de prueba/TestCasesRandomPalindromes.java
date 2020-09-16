
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;

public class TestCasesRandomPalindromes {

    static int RUN = 5;
    static int MAX = 25;
    static int MAXLEN = 50;

    static void randPalindrome() {
        // For random values every time 
        Random r = new Random();
        // A container for storing the palindromes 
        LinkedList<Character> container = new LinkedList<>();
        int LEN; // Length of string 
        for (int i = 1; i <= RUN; i++) {
            LEN = 1 + r.nextInt(MAXLEN);
            // First print the length of string 
            System.out.printf("%d\n", LEN);
            // If it is an odd-length palindrome 
            if (LEN % 2 == 1) {
                container.addLast((char) ('a' + r.nextInt(MAX)));
            }
            // Then print the characters of the palindromic 
            // string 
            for (int j = 1; j <= LEN / 2; j++) {
                char ch = (char) ('a' + r.nextInt(MAX));
                container.addLast(ch);
                container.addFirst(ch);
            }
            for (Character c : container) {
                System.out.printf("%c", c);
            }
            container.clear();
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        randPalindrome();
    }

}
