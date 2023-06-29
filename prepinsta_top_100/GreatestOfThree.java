public class GreatestOfThree {

    static int greatest(int a, int b, int c) {
        if (a > b && b > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int a = 5, b = 10, c = 15;

        System.out.println(greatest(a, b, c));
    }
}
