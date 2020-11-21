package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first num: " );
        float a = scanner.nextFloat();
        System.out.println("Enter operation: ");
        char s = scanner.next().charAt(0);
        System.out.println("Enter second num:");
        float b = scanner.nextFloat();
        float c = 0;

        switch (s){
            case '/':
                c = a/b;
                break;
            case '*':
                c = a*b;
                break;
            case '-':
                c = a-b;
                break;
            case '+':
                c = a+b;
                break;
        }
        System.out.printf("\nproduct of %f and %f is %.4f", a, b, c );

        scanner.close();
    }
}


