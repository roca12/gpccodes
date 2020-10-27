public class Main {
    static long LCMarray(long[]arr){
      long ans=1;
      int divisor=2;
      while(true){
          int counter=0;
          boolean divisible=false;
          for (int i = 0; i < arr.length; i++) {
              if(arr[0]==0){
                  return 0;
              }else if(arr[i]<0){
                  arr[i]=arr[i]*-1;
              }
              if(arr[i]==1){
                  counter++;
              }
              if(arr[i]%divisor==0){
                  divisible=true;
                  arr[i]=arr[i]/divisor;
              }
          }
          if(divisible){
              ans=ans*divisor;
          }else{
              divisor++;
          }
          if(counter==arr.length){
              return ans;
          }
      }
    }
    public static void main(String[] args) {
    long[]arr={2,7,3,9,4};
        System.out.println(LCMarray(arr));
    }
