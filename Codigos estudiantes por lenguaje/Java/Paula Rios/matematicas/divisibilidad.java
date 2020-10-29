public class Main {
    static boolean [] divisibilty(int num){
        String M=String.valueOf(num);
        int n=M.length();
        int sum=0;
        boolean[] isMultipleOf=new boolean[13];
        for (char c :M.toCharArray()) {
            sum+=c-'0';//se le resta a c el valor de 0 en el ascci
        }
        int lastdigit=M.charAt(n-1)-'0';
        isMultipleOf[1]=true;
        isMultipleOf[2]=lastdigit%2==0;
        isMultipleOf[3]=sum%3==0;
        if(n>1){
            isMultipleOf[4]=Integer.parseInt(M.substring(n-2,n))%4==0;
        }else{
            isMultipleOf[4]=lastdigit%4==0;
        }
        isMultipleOf[5]=lastdigit==0||lastdigit==5;
        isMultipleOf[6]=isMultipleOf[2]&&isMultipleOf[3];
        int altSum=0;
        int j=0;
        int[] pattern={1,3,2,-1,-3,-2};
        for (int i =n-1; i>=0; i--) {
            altSum+=pattern[j]*(M.charAt(i)-'0');
            j=(j+1)%6;
        }
        isMultipleOf[7]=Math.abs(altSum)%7==0;
        if(n>2){
            isMultipleOf[8]=Integer.parseInt(M.substring(n-3,n))%8==0;
        }else{
            isMultipleOf[8]=Integer.parseInt(M)%8==0;
        }
        isMultipleOf[9]=sum%9==0;
        isMultipleOf[10]=lastdigit==0;
        isMultipleOf[11]=Math.abs(altSum)%11==0;
        isMultipleOf[12]=isMultipleOf[3]&&isMultipleOf[4];
        return isMultipleOf;
       
    }
    public static void main(String[] args) {
       boolean[]res=divisibilty(100);
        for (int i = 1; i <res.length; i++) {
            System.out.println(i+" "+res[i]);
        }
    }
}
