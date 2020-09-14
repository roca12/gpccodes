
public class ConvertStringIntoAnotherGivenConstraints {

// Function to check is it possible to convert 
// first String into another String or not. 
    static boolean isItPossible(char[] str1, char[] str2,
            int m, int n) {
        // To Check Length of Both String is Equal or Not 
        if (m != n) {
            return false;
        }
        // To Check Frequency of A's and B's are 
        // equal in both Strings or not. 
        if (count(str1, 'A')
                != count(str2, 'A')
                || count(str1, 'B')
                != count(str2, 'B')) {
            return false;
        }
        // Start traversing 
        for (int i = 0; i < m; i++) {
            if (str1[i] != '#') {
                for (int j = 0; j < n; j++) {
                    // To Check no two elements cross each other. 
                    if ((str2[j] != str1[i]) && str2[j] != '#') {
                        return false;
                    }
                    if (str2[j] == str1[i]) {
                        str2[j] = '#';
                        // To Check Is it Possible to Move 
                        // towards Left or not. 
                        if (str1[i] == 'A' && i < j) {
                            return false;
                        }
                        // To Check Is it Possible to Move  
                        // towards Right or not. 
                        if (str1[i] == 'B' && i > j) {
                            return false;
                        }

                        break;
                    }
                }
            }
        }
        return true;
    }

    private static int count(char[] str1, char c) {
        int count = 0;
        for (char temp : str1) {
            if (c == temp) {
                count++;
            }
        }
        return count;
    }

// Drivers code 
    public static void main(String[] args) {
        String str1 = "A#B#";
        String str2 = "A##B";
        int m = str1.length();
        int n = str2.length();
        System.out.print(isItPossible(str1.toCharArray(), str2.toCharArray(), m, n)
                ? "Yes\n" : "No\n");
    }
}
