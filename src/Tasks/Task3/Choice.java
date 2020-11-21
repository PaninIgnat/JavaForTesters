package Tasks.Task3;

import Tasks.Task2;

import java.util.Scanner;

public class Choice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose action: ");
        int choise = scanner.nextInt();
        switch (choise){
            case 1:
                TheLongestWord.main(args);
                break;
            case 2:
                Task2.main(args);
                break;
        }
    }
}
