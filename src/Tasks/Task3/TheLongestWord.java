package Tasks.Task3;

import java.util.Scanner;

public class TheLongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter num of words: ");
        int size = scanner.nextInt();
        String arr [] = new String[size];
        System.out.println("Enter words: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.next();
        }
        String maxWord = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length() > arr[i - 1].length()) {
                maxWord = arr[i];
            }
        }
        System.out.println("Longest word: " + maxWord);
    }
}

