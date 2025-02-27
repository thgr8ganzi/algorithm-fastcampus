package _01문자열;

import java.util.Scanner;

public class _04_문서검색 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String word = sc.nextLine();

        char[] docCharArray = document.toCharArray();
        char[] wordCharArray = word.toCharArray();

        final int docCharLength = docCharArray.length;
        final int wordCharLength = wordCharArray.length;
        int result = 0;

        for (int i = 0; i <= docCharLength - wordCharLength; i++) {
            boolean isMatch = true;
            for (int j = 0; j < wordCharLength; j++) {
                if (docCharArray[i + j] != wordCharArray[j]) {
                    isMatch = false;
                    break;
                }
            }
            if (isMatch) {
                result++;
                i += wordCharLength - 1;
            }
        }
        System.out.println(result);
    }
}
