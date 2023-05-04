package basics.chap_02;

public class Array {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        double avg = 0.0;
        for (int i = 0; i < nums.length; i++) {
            avg += nums[i];
        }
        System.out.print(avg / nums.length);
    }
}
