public class Anagrams_Pattern {

    static final int MAX = 256;
    
    static boolean compare(char arr1[], char arr2[]){
        for (int i = 0; i < MAX; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    
    static void anagramsSearch(String pat, String txt){
        int M = pat.length();
        int N = txt.length();
        char[] countP = new char[MAX];
        char [] countTX = new char[MAX];
        for (int i = 0; i < M; i++) {
            countP[pat.charAt(i)]++;
            countTX[txt.charAt(i)]++;
        }
        for (int i = M; i < N; i++) {
            if(compare(countP, countTX)){
                System.out.println("Encontrado en el indice "+(i - M)+" Anagrama: "+txt.substring(i - M, i));
            }
            countTX[txt.charAt(i)]++;
            countTX[txt.charAt(i - M)]--;
        }
        if(compare(countP, countTX)){
            System.out.println("Encontrado en el indice "+(N - M)+" Anagrama: "+txt.substring(N - M, N));
        }
    }
    
    public static void main(String[] args) {
        String txt = "anitalavalatinaanilegustviajarnitatani";
        String pat = "anita";
        anagramsSearch(pat, txt);
    }
