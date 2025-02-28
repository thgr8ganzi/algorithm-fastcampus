package _01문자열;

import java.util.Scanner;

public class _04_문서검색_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String word = sc.nextLine();

        int startIndex = 0;
        int result = 0;
        while (true) {
            int findIndex = document.indexOf(word, startIndex);
            if (findIndex < 0) {
                break;
            }
            startIndex = findIndex + word.length();
            result++;
        }
        System.out.println(result);
    }
}
