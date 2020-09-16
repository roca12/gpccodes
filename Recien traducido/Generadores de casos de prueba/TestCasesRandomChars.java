// A C++ Program to generate test cases for 
// random characters 

import java.util.Random;

public class TestCasesRandomChars {

    // Define the number of runs for the test data 
    // generated 
    static int RUN = 5;
    // Define the range of the test data generated 
    // Here it is 'a' to 'z' 
    static int MAX = 25;

    static void randomChars() {
        // For random values every time 
        Random r = new Random();
        for (int i = 1; i <= RUN; i++) {
            System.out.printf("%c\n", (char) ('a' + r.nextInt(25)));
        }
    }

    public static void main(String[] args) {
        randomChars();
    }
}
