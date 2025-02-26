package _01문자열;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _03_단어공부 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Map<String, Integer> map = new HashMap<>();
        char[] charArray = str.toCharArray();

        for (char c : charArray) {
            String s = String.valueOf(c).toUpperCase();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int maxCount = 0;
        String max = "";
        boolean isDuplicated = false;

        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            if (entry.getValue() > maxCount) {
                max = entry.getKey();
                maxCount = entry.getValue();
                isDuplicated = false;
            }else if (entry.getValue() == maxCount) {
                isDuplicated = true;
            }
        }
            System.out.println(isDuplicated ? "?" : max);
    }
}
