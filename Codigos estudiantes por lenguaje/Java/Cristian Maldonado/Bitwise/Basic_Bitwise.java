
public class Basic_Bitwise {

    public static void main(String[] args) {
//        bitApagadoMasALaDerecha();
///        encenderBitMasALaDerecha();
///        apagarBitMasALaDerecha();
///        busquedaDelPrimerbitEncendido();
///        cambiarSigno();
///        verificarSiEsImparONo();
///        encenderK_EsimoBit();
///        verificarK_EsimoBitSiEstaEncendidoONo();
///        apagarK_EsimoBit();
///        invertirK_EsimoBit();
    }
    
    static void invertirK_EsimoBit(){
        for (int i = 1; i <= 10; i++) {
            int res = i^(1<<1);
            if(res !=0){
                System.out.println(i + " Se invirtio el bit 2 -> " + res);
                System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
            }
        }
    }
    
    static void apagarK_EsimoBit(){
        for (int i = 1; i <= 10; i++) {
            int res = i & ~(1<<1);
            if(res !=0){
                System.out.println(i + " Se apago el bit 2 -> "+res);
                System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
            }
        }
    }
    
    static void verificarK_EsimoBitSiEstaEncendidoONo(){
        for (int i = 1; i <= 10; i++) {
            int res = i & (1<<1);
            if(res !=0){
                System.out.println(i + " Tiene el bit 2 encendido");
                System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
            }
        }
    }
    
    static void encenderK_EsimoBit(){
       for (int i = 1; i <= 10; i++) {
            int res = i | (1<<1);
            if(res !=0){
                System.out.println(i + " El 2 bit se encendio -> "+res);
                System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
            }
        }
    }

    static void bitApagadoMasALaDerecha() {
        for (int i = 1; i <= 10; i++) {
            int res = ~i & (i + 1);
            System.out.println(i + " -> " + res + ":");
            System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
        }
    }

    static void apagarBitMasALaDerecha() {
        for (int i = 0; i <= 10; i++) {
            int res = i & (i - 1);
            System.out.println(i + " -> " + res + ":");
            System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
        }
    }

    static void encenderBitMasALaDerecha() {
        for (int i = 0; i <= 10; i++) {
            int res = i | (i + 1);
            System.out.println(i + " -> " + res + ":");
            System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
        }
    }

    static void busquedaDelPrimerbitEncendido() {
        for (int i = 1; i <= 10; i++) {
            int res = i & -i;
            System.out.println(i + " -> " + res + ":");
            System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
        }
    }

    static void cambiarSigno() {
        for (int i = 1; i <= 30; i++) {
            int res = ~i + 1;
            System.out.println(i + " -> " + res + ":");
            System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
        }
    }
    
    static void verificarSiEsImparONo() {
        for (int i = 1; i <= 30; i++) {
            int res = i & 1;
            if (res != 0) {
                System.out.println(i + " Es impar");
                System.out.println((Integer.toString(i, 2)) + " -> " + Integer.toString(res, 2));
            }
        }
    }
}
