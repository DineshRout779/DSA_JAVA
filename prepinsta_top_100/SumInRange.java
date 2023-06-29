public class SumInRange {
    public static void main(String[] args) {
        int first = 1, last = 5, sum = 0;
        for (int i = first; i <= last; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
