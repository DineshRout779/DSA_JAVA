public class GreaterOfTwo {

    static int greater(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        int a = 51, b = 45;
        System.out.println(greater(a, b));
    }
}
