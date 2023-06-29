public class CheckPrime {
    static boolean isPrime(int n) {
        int cnt = 0;
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if ((n % i) == 0) {
                cnt++;
                if ((n / i) != i)
                    cnt++;
            }
        }
        return cnt == 2;
    }

    public static void main(String[] args) {
        int n = 36;
        if (isPrime(n)) {
            System.out.println("It's a prime");
        } else {
            System.out.println("It's not a prime");
        }
    }
}
