public class PrimesInRange {
    static boolean isPrime(int n) {
        int count = 0;
        for (int i = 1; (i * i) <= n; i++) {
            if (n % i == 0) {
                count++;
                if ((n / i) != i) {
                    count++;
                }
            }
        }
        return count == 2;
    }

    public static void main(String[] args) {
        int low = 1, high = 10;

        for (int i = low; i <= high; i++) {
            if (isPrime((i))) {
                System.out.println(i);
            }
        }
    }
}
