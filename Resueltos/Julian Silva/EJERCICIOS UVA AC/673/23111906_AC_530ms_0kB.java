
import java.util.*;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < t; i++) {

            String str1 = sc.nextLine();

            if (x(str1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }

    }

    public static boolean x(String str) {
        char[] chars = str.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char c : chars) {

            if (c == '(') {
                stack.push(0);
            } else if (c == '[') {
                stack.push(1);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop() != 0) {
                    return false;
                }
            } else if (c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop() != 1) {
                    return false;
                }
            }

        }

        return stack.isEmpty();
    }
}
