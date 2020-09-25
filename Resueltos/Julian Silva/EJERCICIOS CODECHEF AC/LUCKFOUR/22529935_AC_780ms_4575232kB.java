

import java.util.*;



class Main {

    public static void main(String[] args) throws java.lang.Exception {
       
        try {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0) {
                int n = sc.nextInt();
                int c = 0;
                while (n > 0) {
                    if (n % 10 == 4) {
                        c++;
                    }
                    n = n / 10;
                }
                System.out.println(c);
                t--;
            }
        } catch (Exception e) {
            return;
        }
    }
}
