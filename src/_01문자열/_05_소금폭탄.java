package _01문자열;

public class _05_소금폭탄 {
    public static void main(String[] args) {
        String time = "09:10:59";
        int hour = (time.charAt(0) - '0') * 10 + time.charAt(1) - '0';
        System.out.println(hour);
        int min = (time.charAt(3) - '0') * 10 + time.charAt(4) - '0';
        System.out.println(min);
        int sec = (time.charAt(6) - '0') * 10 + time.charAt(7) - '0';
        System.out.println(sec);
    }
}
