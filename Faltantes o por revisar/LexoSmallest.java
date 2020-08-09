// Java program to find lexicographically 
// smallest sequence with rotations. 

public class LexoSmallest {
    // Function to compare lexicographically 
    // two sequence with different starting 
    // indexes. It returns true if sequence 
    // beginning with y is lexicographically 
    // greater. 

    static boolean compareSeq(char[] S, int x, int y, int n) {
        for (int i = 0; i < n; i++) {
            if (S[x] < S[y]) {
                return false;
            } else if (S[x] > S[y]) {
                return true;
            }
            x = (x + 1) % n;
            y = (y + 1) % n;
        }
        return true;
    }

    // Function to find starting index 
    // of lexicographically smallest sequence 
    static int smallestSequence(char[] S, int n) {
        int index = 0;
        for (int i = 1; i < n; i++) // if new sequence is smaller 
        {
            if (compareSeq(S, index, i, n)) // change index of current min 
            {
                index = i;
            }
        }

        return index;
    }

    // Function to print lexicographically 
    // smallest sequence 
    static void printSmallestSequence(String str, int n) {
        char[] S = str.toCharArray();
        int starting_index = smallestSequence(S, n);
        for (int i = 0; i < n; i++) {
            System.out.print(S[(starting_index + i) % n]);
        }
    }

    // driver code 
    public static void main(String[] args) {
        String S = "DCACBCAA";
        int n = 8;
        printSmallestSequence(S, n);
    }
}
