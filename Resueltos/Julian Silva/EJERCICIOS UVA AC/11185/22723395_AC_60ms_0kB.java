

import java.util.Scanner;

public class Main{

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()) {
            long b=sc.nextLong();
            if(b<0)break;
            System.out.println(Long.toString(b,3));
        }
    }
}