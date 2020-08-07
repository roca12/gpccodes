public class Add_One {

    static int addOne(int x){
        return (-(~x));
    }
    
    public static void main(String[] args) {
        int a = 13;
        System.out.println(a + " -->"+Integer.toString(a, 2));
        a = addOne(a);
        System.out.println(a + " -->"+Integer.toString(a, 2));
    }  
}
