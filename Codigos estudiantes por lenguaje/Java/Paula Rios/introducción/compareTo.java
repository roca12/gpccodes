import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static class Persona implements Comparable<Persona> {
        String nombre;
        Integer edad;
        public Persona(String nombre, Integer edad) {
            this.nombre=nombre;
            this.edad= edad;
        }
        @Override
        public int compareTo(Persona otro) {
            if (this.edad>otro.edad) {
                return 1;
            }else if (this.edad==otro.edad) {
                return 0;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        Persona roca= new Persona("Diego",23);
        Persona kpo = new Persona("Bryann", 20);
        Persona daniel = new Persona("Dtiven", 19);
        Persona juas_juas = new Persona("Daniel", 17);
        Persona juano = new Persona ("Juan",19);
        Persona el_de_nuestros_corazones= new Persona("Edwin", 18);
        Persona ares = new Persona("Sebastian", 19);
        Persona fuerzaedwin = new Persona("El luchador", 19);
        Persona dianita= new Persona("Diana", 18);
        
        ArrayList<Persona> lossaltamontes = new ArrayList<>();
        lossaltamontes.add(roca);
        lossaltamontes.add(juano);
        lossaltamontes.add(kpo);
        lossaltamontes.add(ares);
        lossaltamontes.add(fuerzaedwin);
        lossaltamontes.add(juas_juas);
        lossaltamontes.add(daniel);
        lossaltamontes.add(dianita);
        lossaltamontes.add(el_de_nuestros_corazones);
        Collections.sort(lossaltamontes);
        for (Persona p : lossaltamontes) {
            System.out.println(p.nombre+"->"+p.edad);
        }
        
    }
}
