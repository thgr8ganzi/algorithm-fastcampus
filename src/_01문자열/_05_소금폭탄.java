package _01문자열;

import java.util.Scanner;

public class _05_소금폭탄 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.nextLine();
        String time2 = sc.nextLine();

        int curTime = getTime(time);
        int futureTime = getTime(time2);


        String result = getTimeStr(futureTime - curTime <= 0 ? futureTime - curTime + 24 * 3600 : futureTime - curTime);
        System.out.printf("%s", result);
    }

    private static String getTimeStr(int i) {
        return String.format("%02d:%02d:%02d", i / 3600, (i % 3600) / 60, i % 60);
    }

    private static int getTime(String time) {
        String[] timeArr = time.split(":");
        int hour = Integer.parseInt(timeArr[0]) * 3600;
        int minute = Integer.parseInt(timeArr[1]) * 60;
        int second = Integer.parseInt(timeArr[2]);
        return hour + minute + second;
    }
}
