import java.util.Scanner;

public class Main {
 static int num=1;
    static void computeLPSarray(String pat, int M, int lps[]){
        int len=0;
        int i=1;
        lps[0]=0;
        while(i<M){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=len;
                    i++;
                }
            }
        }
    }
    static void KMPSearch(String pat,String txt){
        int M=pat.length();
        int N=txt.length();
        int lps[]=new int [M];
        int j=0;
        computeLPSarray(pat, M, lps);
        int i=0;
        while(i<N){
            if(pat.charAt(j)==txt.charAt(i)){
                i++;
                j++;
            }if(j==M){
                if(num==1){
                    num=0;
                }else{
                    System.out.print(" ");
                }
                System.out.print((i-j));
          
                j=lps[j-1];  
            }else if(i<N&&pat.charAt(j)!=txt.charAt(i)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i=i+1;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pat,txt;
        while(sc.hasNext()){
            pat=sc.nextLine();
            txt=sc.nextLine();
               KMPSearch(pat, txt);
               num=1;
               System.out.println();
        }
    
             
    }
}
