// Java program to calculate 
// possible timings. 

public class PossibleTimings {
    // Array storing different 
    // numbers of digits a particular 
    // digit can be replaced with 

    static int num[] = {2, 7, 2, 3, 3, 4, 2, 5, 1, 2};

    // Function performing calculations 
    public static void possibleTimings(String n) {
        System.out.println(num[(n.charAt(0) - '0')]
                * num[n.charAt(1) - '0']);
    }

    // Driver function 
    public static void main(String args[]) {
        String n = "05";
        // Calling function 
        possibleTimings(n);
    }
}
