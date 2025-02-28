package _01문자열;

import java.util.Scanner;

public class _04_문서검색_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String word = sc.nextLine();

        int docLength = document.length();
        int wordLength = word.length();
        int result = 0;
        int i = 0;

        while (i <= docLength - wordLength) {
            if (document.substring(i, i + wordLength).equals(word)) {
                result++;
                i += wordLength;
            } else {
                i++;
            }
        }
        System.out.println(result);
    }
}
