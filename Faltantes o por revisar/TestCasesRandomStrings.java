
import java.util.Random;

// A C++ Program to generate test cases for 
// random strings 
public class TestCasesRandomStrings {

    // Define the number of runs for the test data 
    // generated 
    static int RUN = 5;
    // Define the range of the test data generated 
    // Here it is 'a' to 'z' 
    static int MAX = 25;
    // Define the maximum length of string 
    static int MAXLEN = 100;

    static void randString() {
        //For random values every time 
        Random r = new Random();
        int LEN; // Length of string 
        for (int i = 1; i <= RUN; i++) {
            LEN = 1 + r.nextInt(MAXLEN);
            // First print the length of string 
            System.out.printf("%d\n", LEN);
            // Then print the characters of the string 
            for (int j = 1; j <= LEN; j++) {
                System.out.printf("%c", (char)('a' + r.nextInt(MAX)));
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        randString();
    }

}
