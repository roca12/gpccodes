
public class Main{    
    
    static void computeLPSarray(String pat, int M, int lps[]) {
        int len=0;
        int i=1;
        lps[0]=0;
        while(i<M){
            if(pat.charAt(i)==pat.charAt(len)) {
                len++;
                lps[i]= len;
                i++;
            }else {
                if(len !=0) {
                    len = lps[len-1];
                }else {
                    lps[i] = len;
                    i++;
                }
            }
        }
        
    }
    
    static void KMPSearch(String pat, String txt) {
        int M = pat.length();
        int N=txt.length();
        int lps[]= new int[M];
        int j=0;
        computeLPSarray(pat, M, lps);
        int i=0;
        while(i<N) {
            if(pat.charAt(j)==txt.charAt(i)) {
                i++;
                j++;
            }
            if(j==M) {
                System.out.println("Patrón encontrado en el índice "+(i-j)+"-"+(i-1));
                j=lps[j-1];
            }else if (i<N&&pat.charAt(j) != txt.charAt(i)) {
                if(j!=0) {
                    j=lps[j-1];
                }else {
                    i=i+1;
                }
            }
        }
        
    }

    public static void main(String[] args){
        String txt = "Núcleo celular, en biología celular y citología, "
        		+ "parte central de la célula rodeada de una membrana propia, "
        		+ "llamada membrana nuclear, que contiene "
        		+ "el ácido desoxirribonucleico (ADN o en inglés DNA) celular, "
        		+ "donde se encuentran codificados los genes.";
        String pat = "la";
        KMPSearch(pat, txt);
    }
}
