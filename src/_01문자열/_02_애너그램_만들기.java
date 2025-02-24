package _01문자열;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _02_애너그램_만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        Map<Character, Integer> mapA = new HashMap<>();
        Map<Character, Integer> mapB = new HashMap<>();

        makeMap(a, mapA);
        makeMap(b, mapB);

        int result = 0;

        for (int i = 'a'; i <= 'z'; i++) {
            Character c = (char) i;
            result += Math.abs(mapA.getOrDefault(c, 0) - mapB.getOrDefault(c, 0));
        }

        System.out.println(result);
    }

    static void makeMap(String str, Map<Character, Integer> map) {
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
    }
}