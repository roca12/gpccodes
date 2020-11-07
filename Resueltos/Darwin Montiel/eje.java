import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int ronda = lec.nextInt();
        while(ronda != -1){
            lec.nextLine();
            System.out.println("round"+ronda);
            int errores=0;
            String palabracorrecta = lec.nextLine();
            String intentos = lec.nextLine();
            String aux="";
            for (int i = 0; i < palabracorrecta.length(); i++) {
                aux+='@';
            }
            for (int i = 0; i < intentos.length(); i++) {
                if(!palabracorrecta.contains(intentos.charAt(i)+"")){
                    errores++;
                }else{
                    palabracorrecta=palabracorrecta.replace(intentos.charAt(i),'@');
                }
            }
            if (errores>=7) {
                System.out.println("You lose.");
            } else if(palabracorrecta.equals(aux)&&errores<7){
                System.out.println("You win.");
            }else{
                System.out.println("You chickende out.");
            }
            ronda=lec.nextInt();
        }
    }
    
}
