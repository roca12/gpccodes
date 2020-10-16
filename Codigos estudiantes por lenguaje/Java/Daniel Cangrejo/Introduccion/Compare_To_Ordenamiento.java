public class prueba {
    static class Persona {
        String nombre;
        Integer edad;
        public Persona(String nombre, Integer edad) {
      this.nombre=nombre;
            this.edad= edad;
        }

    }

    public static void main(String[] args) {
        Persona roca= new Persona("Diego",23);
        Persona el_mas_sano = new Persona("Stiven", 19);
        Persona kpo = new Persona("Bryann", 20);
        Persona daniel = new Persona("Dtiven", 19);
        Persona juas_juas = new Persona("Daniel", 17);
        Persona impostor = new Persona ("Yeison", 17);
        Persona juano = new Persona ("Juan",19);
        Persona el_de_nuestros_corazones= new Persona("Edwin", 18);
        Persona el_nuevo = new Persona("Johan", 16);
        Persona ares = new Persona("Sebastian", 19);
        Persona fuerzaedwin = new Persona("El luchador", 19);
        Persona dianita= new Persona("Diana", 18);

        ArrayList<Persona> lossaltamontes = new ArrayList<>();
        lossaltamontes.add(roca);
        lossaltamontes.add(el_mas_sano);
        lossaltamontes.add(juano);
        lossaltamontes.add(kpo);
        lossaltamontes.add(ares);
        lossaltamontes.add(fuerzaedwin);
        lossaltamontes.add(juas_juas);
        lossaltamontes.add(daniel);
        lossaltamontes.add(impostor);
        lossaltamontes.add(el_nuevo);
        lossaltamontes.add(dianita);
        lossaltamontes.add(el_de_nuestros_corazones);
        lossaltamontes.add(new Persona("Jesus", 28));
        Collections.sort(lossaltamontes, new Comparator<Persona>() {
            @Override
            public int compare(Persona uno, Persona otro) {
                if (uno.edad>otro.edad) {
                    return 1;
                }else if (uno.edad==otro.edad) {
                    return 0;
                }
                return -1;
            }
        });
        for (Persona p : lossaltamontes) {
            System.out.println(p.nombre+"->"+p.edad);
        }
    }
}
