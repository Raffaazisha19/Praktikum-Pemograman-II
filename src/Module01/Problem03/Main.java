package Module01.Problem03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        int n = scanner.nextInt();
        int startNumber = scanner.nextInt();

        int count = 0;
        int number = startNumber;

        do {
            if (number % 2 != 0) {
                if (count > 0) {
                    System.out.print(", ");
                }
                System.out.print(number);
                count++;
            }
            number++;
        } while (count < n);

        System.out.println();
    }
}
