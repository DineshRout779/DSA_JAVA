package basics.chap_02;

public class CheckScope {
    public static void main(String[] args) {
        int a = 5;
        {
            int b = 5;
            System.out.println(b);
        }
        System.out.println(a);
    }
}
