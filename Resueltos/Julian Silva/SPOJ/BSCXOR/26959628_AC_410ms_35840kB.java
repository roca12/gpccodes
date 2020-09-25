import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a1, a2;
        a1=sc.nextInt();
        a2=sc.nextInt();
        int c= a1^a2;
        System.out.println(c);
    }
}


