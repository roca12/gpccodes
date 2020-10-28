import java.util.Arrays;
public class Main {
   static char text[];
   static int min(int a, int b){
       return a>b?a:b;
   }
   static void findLPS(){
       int N=text.length;
       if(N==0){
           return;
       }
       N=2*N+1;
       int L[]=new int [N];
       L[0]=0;
       L[1]=1;
       int C=1;
       int R=2;
       int i=0;
       int iMirror;
       int maxLPSlenght=0;
       int maxLPSCenterPos=0;
       int start=-1;
       int end=-1;
       int diff=-1;
       for(i=2;i<N;i++){
           iMirror=2*C-i;
           L[i]=0;
           diff=R-i;
           if(diff>0){
               L[i]=min(L[iMirror],diff);
           }
           try{
               while(((i + L[i]) < N && (i - L[i]) > 0)
                            && (((i + L[i] + 1) % 2 == 0) || (text[(i + L[i] + 1) / 2] == text[(i - L[i] - 1) / 2]))){
                   L[i]++;
               }
           }catch(Exception e){
               
           }
           if(L[i]>maxLPSlenght){
               maxLPSlenght=L[i];
               maxLPSCenterPos=i;
           }
           if(i+L[i]>R){
               C=i;
               R=i+L[i];
           }
       }
       start=(maxLPSCenterPos-maxLPSlenght)/2;
       end=start+maxLPSlenght-1;
       System.out.println("LPS del string es "+String.copyValueOf(text)+" :");
       for ( i = start; i <=end; i++) {
           System.out.printf("%c",text[i]); 
       }
       System.out.println();
   }
    
    public static void main(String args[]) {
        text="OABAABAOBO".toCharArray();
        findLPS();
    }
}
