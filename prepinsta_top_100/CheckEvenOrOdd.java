
public class CheckEvenOrOdd {

    public static void main(String[] args) {
        int n = 26;

        if ((n ^ 1) == (n + 1))
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
