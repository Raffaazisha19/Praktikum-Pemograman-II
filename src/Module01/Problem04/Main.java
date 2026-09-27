package Module01.Problem04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abu = scanner.nextLine().replace(" ", "").toUpperCase();

        System.out.print("Tangan Bagas: ");
        String bagas = scanner.nextLine().replace(" ", "").toUpperCase();

        int score = 0;

        for (int i = 0; i < 3; i++) {
            char a = abu.charAt(i);
            char b = bagas.charAt(i);

            if (a != b) {
                if ((a == 'B' && b == 'G') || (a == 'G' && b == 'K') || (a == 'K' && b == 'B')) {
                    score++;
                } else {
                    score--;
                }
            }
        }

        if (score > 0) {
            System.out.println("Abu");
        } else if (score < 0) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }
    }
}
