
import java.util.Random;

// A java Program to generate test cases for 
// random strings 
public class TestCasesRandomArrayStrings {

    // Define the number of runs for the test data 
    // generated 
    static int RUN = 1000;
    // Define the range of the test data generated 
    // Here it is 'a' to 'z' 
    static int MAX = 25;
    // Define the range of number of strings in the array 
    static int MAXNUM = 20;
    // Define the maximum length of string 
    static int MAXLEN = 20;

    static void randomStrArr() {
        Random r = new Random();
        // Uncomment the below line to store 
        // the test data in a file 
        // freopen ("Test_Cases_Array_of_Strings.in", "w", stdout); 
        int NUM; // Number of strings in array 
        int LEN; // Length of string 
        for (int i = 1; i <= RUN; i++) {
            NUM = 1 + r.nextInt(MAXNUM);
            System.out.printf("%d\n", NUM);
            for (int k = 1; k <= NUM; k++) {
                LEN = 1 + r.nextInt(MAXLEN);;
                // Then print the characters of the string 
                for (int j = 1; j <= LEN; j++) {
                    System.out.printf("%c", 'a' + r.nextInt(MAX));
                }

                System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        // Uncomment the below line to store 
        // the test data in a file 
        // fclose(stdout); 
    }

    public static void main(String[] args) {
        randomStrArr();
    }
}
