public class Multiply_2_to_10 {

    public static void main(String[] args) {
        int a = 18;
        System.out.println(multiplyByTwo(a));
        System.out.println(multiplyByThree(a));
        System.out.println(multiplyByFour(a));
        System.out.println(multiplyByFive(a));
        System.out.println(multiplyBySix(a));
        System.out.println(multiplyBySeven(a));
        System.out.println(multiplyByEight(a));
        System.out.println(multiplyByNine(a));
        System.out.println(multiplyByTen(a));
    }

    static int multiplyByTwo(int n) {
        return (n << 1);
    }

    static int multiplyByThree(int n) {
        return ((n << 1) + n);
    }

    static int multiplyByFour(int n) {
        return (n << 2);
    }

    static int multiplyByFive(int n) {
        return ((n << 2) + n);
    }

    static int multiplyBySix(int n) {
        return ((n << 3) - (n << 1));
    }

    static int multiplyBySeven(int n) {
        return ((n << 3) - n);
    }

    static int multiplyByEight(int n) {
        return (n << 3);
    }

    static int multiplyByNine(int n) {
        return ((n << 3) + n);
    }

    static int multiplyByTen(int n) {
        return (n << 3) + (n << 1);
    }
}
