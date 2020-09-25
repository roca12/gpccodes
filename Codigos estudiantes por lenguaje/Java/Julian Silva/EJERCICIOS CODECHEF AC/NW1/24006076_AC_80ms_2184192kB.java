import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static int[] cont = {4, 4, 4, 4, 4, 4, 4};
    static int g = 0;

    public static void main(String[] args) {
        int x = sc.nextInt();
        int dia;
        String semana;
        ArrayList<String> diassemana = new ArrayList<>();
        diassemana.add("");
        diassemana.add("mon");
        diassemana.add("tues");
        diassemana.add("wed");
        diassemana.add("thurs");
        diassemana.add("fri");
        diassemana.add("sat");
        diassemana.add("sun");
        for (int i = 0; i < x; i++) {
             g = 0;
            Arrays.fill(cont, 4);
            dia = sc.nextInt();
            semana = sc.nextLine();
            semana= semana.substring(1);
            g = diassemana.indexOf(semana);
            if (dia == 28) {
                print(0);
            } else {
                print(dia - 28);
            }
        }
    }

    private static void print(int mas) {
        if (mas == 0) {
            for (int i = 0; i < cont.length; i++) {
                System.out.print(cont[i] + " ");
            }
            System.out.println("");
        } else {
            switch (mas) {
                case 1:
                    switch (g) {
                        case 1:
                            cont[0]++;
                            break;
                        case 2:
                            cont[1]++;
                            break;
                        case 3:
                            cont[2]++;
                            break;
                        case 4:
                            cont[3]++;
                            break;
                        case 5:
                            cont[4]++;
                            break;
                        case 6:
                            cont[5]++;
                            break;
                        case 7:
                            cont[6]++;
                            break;
                        default:
                            break;
                    }
                    print(0);
                    break;
                case 2:
                    switch (g) {
                        case 1:
                            cont[0]++;
                            cont[1]++;
                            break;
                        case 2:
                            cont[1]++;
                            cont[2]++;
                            break;
                        case 3:
                            cont[2]++;
                            cont[3]++;
                            break;
                        case 4:
                            cont[3]++;
                            cont[4]++;
                            break;
                        case 5:
                            cont[4]++;
                            cont[5]++;
                            break;
                        case 6:
                            cont[5]++;
                            cont[6]++;
                            break;
                        case 7:
                            cont[6]++;
                            cont[0]++;
                            break;
                        default:
                            break;
                    }
                    print(0);
                    break;
                case 3:
                    switch (g) {
                        case 1:
                            cont[0]++;
                            cont[1]++;
                            cont[2]++;
                            break;
                        case 2:
                            cont[1]++;
                            cont[2]++;
                            cont[3]++;
                            break;
                        case 3:
                            cont[2]++;
                            cont[3]++;
                            cont[4]++;
                            break;
                        case 4:
                            cont[3]++;
                            cont[4]++;
                            cont[5]++;
                            break;
                        case 5:
                            cont[4]++;
                            cont[5]++;
                            cont[6]++;
                            break;
                        case 6:
                            cont[5]++;
                            cont[6]++;
                            cont[0]++;
                            break;
                        case 7:
                            cont[6]++;
                            cont[0]++;
                            cont[1]++;
                            break;
                        default:
                            break;
                    }
                    print(0);
                    break;
                default:
                    break;
            }
        }
    }
}

