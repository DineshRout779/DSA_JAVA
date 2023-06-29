public class LeapYear {

    static boolean checkLeap(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2016;
        System.out.println(checkLeap(year));
    }
}
