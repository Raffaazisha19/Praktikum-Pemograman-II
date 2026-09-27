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
        StringBuilder result = new StringBuilder();

        do {
            if (number % 2 != 0) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(number);
                count++;
            }
            number++;
        } while (count < n);

        System.out.println(result.toString());

    }
}