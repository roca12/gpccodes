// java code to find whether 
// house can be cleaned or not 
import java.util.ArrayList;

public class CleaningRoom {

    static class Pair {

        int a, b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
    // Matrix A stores the string 
    static int A[][] = new int[105][105];
    // ans stores the pair of indices 
    // to be cleaned by the machine 
    static ArrayList<Pair> ans = new ArrayList<>();
    // Function for printing the 
    // vector of pair 

    static void print() {
        System.out.println("Yes, the house can be cleaned.");
        for (int i = 0; i < ans.size(); i++) {
            System.out.println((ans.get(i).a + " " + ans.get(i).b));
        }
    }
    // Function performing calculations 

    static void solve(int n) {
        // push every first cell in 
        // each row containing '.' 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == '.') {
                    ans.add(new Pair(i + 1, j + 1));
                    break;
                }
            }
        }
        // If total number of cells are 
        // n then house can be cleaned 
        if (ans.size() == n) {
            print();
            return;
        }

        ans = new ArrayList<>();

        // push every first cell in 
        // each column containing '.' 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == '.') {
                    ans.add(new Pair(i + 1, j + 1));
                    break;
                }
            }
        }
        // If total number of cells are 
        // n then house can be cleaned 
        if (ans.size() == n) {
            print();
            return;
        }
        System.out.println("house cannot be cleaned.");
    }

    public static void main(String[] args) {
        int n = 3;
        String s = "";
        s += ".**";
        s += ".**";
        s += ".**";
        int k = 0;
        //Loop to insert letters from 
        //string to array 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = s.charAt(k);
                k += 1;
            }
        }
        solve(n);
    }

}
