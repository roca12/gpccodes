import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
     ArrayList<Integer>lista=new ArrayList<>();
     for(int i=0;i<10;i++){
         lista.add(i*i);
     }
     for(int i=0;i<lista.size();i++){
         System.out.println(lista.get(i));
     }
    }
}
