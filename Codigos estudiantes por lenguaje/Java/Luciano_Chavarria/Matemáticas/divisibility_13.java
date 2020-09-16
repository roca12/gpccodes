public class Main {

    static boolean[] divisibility(int num) {
        String M = String.valueOf(num);
        int n = M.length();
        boolean[] isMultipleOf = new boolean[13];
        int sum = 0;
        for (char c : M.toCharArray()) {
            sum += c - '0';
        }
        int lastDigit = M.charAt(n - 1) - '0';
        isMultipleOf[1] = true;
        isMultipleOf[2] = lastDigit % 2 == 0;
        isMultipleOf[3] = sum % 3 == 0;
        if (n > 1) {
            isMultipleOf[4] = Integer.parseInt(M.substring(n - 2, n)) % 4 == 0;
        } else {
            isMultipleOf[4] = lastDigit % 4 == 0;
        }
        isMultipleOf[5] = lastDigit == 0 || lastDigit == 5;
        isMultipleOf[6] = isMultipleOf[2] && isMultipleOf[3];
        int altsum = 0;
        int[] pattern = {1, 3, 2, -1, -3, -2};
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            altsum += pattern[j] * (M.charAt(i) - '0');
            j = (j + 1) % 6;
        }
        isMultipleOf[7] = Math.abs(altsum) % 7 == 0;
        if (n > 2) {
            isMultipleOf[8] = Integer.parseInt(M.substring(n - 3, n)) % 8 == 0;
        } else {
            isMultipleOf[8] = Integer.parseInt(M) % 8 == 0;
        }
        isMultipleOf[9] = sum % 8 == 0;
        isMultipleOf[10] = lastDigit == 0;
        altsum = 0;
        int s = 1;
        for (int i = n - 1; i >= 0; i--) {
            altsum += s * (M.charAt(i) - '0');
            s = -s;
        }
        isMultipleOf[11] = Math.abs(altsum) % 11 == 0;
        isMultipleOf[12] = isMultipleOf[2] && isMultipleOf[4];
        return isMultipleOf;
    }

    public static void main(String[] args) {
            boolean [] res = divisibility(33);
            for (int i = 0; i < res.length; i++) {
                System.out.println(i+" :"+res[i]);
        }
    }

}
