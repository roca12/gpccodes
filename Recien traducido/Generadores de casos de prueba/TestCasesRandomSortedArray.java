// A C++ Program to generate test cases for 
// array filled with random numbers 

import java.util.Arrays;
import java.util.Random;

public class TestCasesRandomSortedArray {

    // Define the number of runs for the test data 
    // generated 
    static int RUN = 5;
    // Define the range of the test data generated 
    static int MAX = 100000;
    // Define the maximum number of array elements 
    static int MAXNUM = 100;

    static void randSortedArray() {
        // For random values every time 
        Random r = new Random();
        int NUM; // Number of array elements 
        for (int i = 1; i <= RUN; i++) {
            NUM = 1 + r.nextInt(MAXNUM);
            int[] arr = new int[NUM];
            // First print the number of array elements 
            System.out.printf("%d\n", NUM);
            for (int j = 0; j < NUM; j++) {
                arr[j] = r.nextInt(MAX);
            }
            // Sort the generated random array 
            Arrays.sort(arr);
            // Print the sorted random array 
            for (int j = 0; j < NUM; j++) {
                System.out.printf("%d ", arr[j]);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        randSortedArray();
    }
}
