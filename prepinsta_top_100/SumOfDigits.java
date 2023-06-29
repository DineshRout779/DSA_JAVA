public class SumOfDigits {
    public static void main(String[] args) {
        int num = 1234, sum = 0;
        for (; num != 0; sum += num % 10, num /= 10)
            ;
        System.out.println(sum);
    }
}
